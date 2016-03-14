/*
    AN ILLUSTRATIVE L PROGRAM
    Written 2015/12/22, updated 2016/03/14
    Vu Phan

    This L program outputs ranks of students in an imaginary course
*/


type student = {ann, bree, cher, dale, flo, gray}. 
    /* Comment: Define a set by listing its members */


const quizzes = 2. /* Define a constant */
type quiz_num = {1..quizzes}. /* Range of integers */
type quiz = q(Num) where Num in quiz_num. /* Set-builder notation */

const exams = quizzes + 1.
type exam_num = {1..exams}.
type exam = e(Num) where Num in exam_num.

type assessment = quiz + exam. /* Union of sets */


type quiz_grade = {pass, fail}.
type exam_grade = {a, b, c, d, f}.
type grade = quiz_grade + exam_grade.
type acceptable_grade = grade \ {fail, f}. /* Difference of sets */
    
    
assessment_score(ann, q(1), pass). /* Student "ann" scores "pass" on assessment "q(1)" */
assessment_score(ann, q(2), pass). 
assessment_score(ann, e(1), a). 
assessment_score(ann, e(2), a). 
assessment_score(ann, e(3), a). 

assessment_score(bree, q(1), pass). 
assessment_score(bree, q(2), pass). 
assessment_score(bree, e(1), a). 
assessment_score(bree, e(2), a).
assessment_score(bree, e(3), b). 

assessment_score(cher, q(1), pass). 
assessment_score(cher, q(2), pass). 
assessment_score(cher, e(1), a). 
assessment_score(cher, e(2), b). 
assessment_score(cher, e(3), b).

assessment_score(dale, q(1), pass). 
assessment_score(dale, q(2), pass). 
assessment_score(dale, e(1), b). 
assessment_score(dale, e(2), b).
assessment_score(dale, e(3), b).

assessment_score(flo, q(1), pass). 
assessment_score(flo, q(2), fail). 
assessment_score(flo, e(1), d). 
assessment_score(flo, e(2), d).
assessment_score(flo, e(3), f). 

assessment_score(gray, q(1), fail).
assessment_score(gray, e(1), f).

/* Assessment A of student S is acceptable if its grade is 
    either: pass (for a quiz), or a/b/c/d (for an exam) */    
acceptable_assessment(student S, assessment A) if
    assessment_score(S, A, some acceptable_grade).

    
    
type rank = {outstanding, above_average, average, below_average, inferior}.

higher_rank(outstanding, above_average).
higher_rank(above_average, average).
higher_rank(average, below_average).
higher_rank(below_average, inferior).

/* Transitivity */
higher_rank(rank R1, rank R3) if
    higher_rank(R1, rank R2) and
    higher_rank(R2, R3).


    
/* Note below: If a student meets the criterion for a rank, 
                then she also meets the criterion for each lower rank */
    
student_meets_criterion(student S, outstanding) if
    acceptable_assessment(S, every assessment) and
    assessment_score(S, every exam, a).
    
student_meets_criterion(student S, above_average) if
    acceptable_assessment(S, every assessment) and
        assessment_score(S, exam E1, a) and assessment_score(S, exam E2, a) and E1 != E2.
        /* Scoring "a" on two (distinct) exams */

student_meets_criterion(student S, average) if
    acceptable_assessment(S, every assessment) and
    assessment_score(S, some exam, a).
    
student_meets_criterion(student S, below_average) if
    acceptable_assessment(S, every assessment).
   
/* Default rank's criterion is met by all students */
student_meets_criterion(every student, inferior).


    
/* The two rules below mean: a student isn't in a rank if either:
    she doesn't meet the criterion for that rank, or
    she already meets the criterion for a higher rank */
    
not student_rank(student S, rank R2) if
    not student_meets_criterion(S, R2) or
    student_meets_criterion_for_higher_rank(S, some rank, R2).
    
student_meets_criterion_for_higher_rank(student S, rank R1, rank R2) if
    student_meets_criterion(S, R1) and higher_rank(R1, R2).
    
    
student_dropped(gray).
student_remaining(student S) if not student_dropped(S).

/* For each rank, a remaining student is possibly in that rank */
maybe student_rank(student S, rank R) if student_remaining(S).


/* Each remaining student is in precisely one rank */
1 <= |{student_rank(student S, rank R)}| <= 1 if student_remaining(S).


/* The program has one model containing, among other atoms, a rank for every student:
 student_rank(bree,above_average) student_rank(dale,below_average) student_rank(cher,average) ... 
 */

