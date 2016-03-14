/* Chapter 5 of the EUR RVSM Safety Case */

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAM A-4~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*The following corresponds to diagram A-4, goal G2: */

safety_reqts_fully_realised if                              
                     airspace_design_complies_with_SRs,
                     fc_procedure_design_complies_with_SRs,
                     fc_training_design_complies_with_SRs,
                     aircraft_equipment_design_complies_with_SRs,
                     atc_procedure_design_complies_with_SRs,
                     atc_training_design_complies_with_SRs,
                     atc_equipment_design_complies_with_SRs,
                     system_monitoring_complies_with_SRs,
                     safety_constraints_satisfied,
                     srs_are_fully_traceable_to_concept,
                     residual_risks_controlled,
                     /* Note, I have replaced the original wording "residual_risks_tolerable,
                     % because the evidence in 5.12 says that some of them are not tolerable! */ 
                     concept_meets_RVSM_safety_requirements.

srs_are_fully_traceable_to_concept. /* Section 5.11.*/

/*Section 5.12 */
type residual_risk = {level_busts, asac_usage_risks, wake_vortices, mountain_waves,
                  operational_errors}.

residual_risks_controlled if
          controlled(every residual_risk).



controlled(residual_risk R) if mitigated(R) or tolerable(R).
mitigated(level_busts). /* Section 5.12.1 */
mitigated(asac_usage_risks). /* Section 5.12.2 */
tolerable(wake_vortices)./* Section 5.12.3 */
tolerable(mountain_waves). /* Section 5.12.4 */
tolerable(operational_errors). /*Section 5.12.5 */
            
/*Section 5.13 */
concept_meets_RVSM_safety_requirements if 
             height_keeping_requirements_covered,
             operational_risk_requirements_covered,
             total_vertical_risk_covered.

height_keeping_requirements_covered. /* Section 5.13.1 */
operational_risk_requirements_covered. /* Section 5.13.2 */
total_vertical_risk_covered. /*Section 5.13.3*/
/*Question should we provide the details, e.g, given in section 5.13.1 */

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAM A-5~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

/*The following corresponds to strategy St2.1.1 */ 
airspace_design_complies_with_SRs if
                     transition_areas,
                     six_new_RVSM_flight_levels,
                     risks_controlled,
                     contingency_facilities.

/* the union of G2.1.1.1, G2.1.2.1 and G2.1.2.4 */
transition_areas if
                     transition_areas_produced_by_competent_staff,
                     transition_areas_validated_by_competent_staff.

transition_areas_produced_by_competent_staff. /* See Sections 5.2.3 and 5.2.6iv */
transition_areas_validated_by_competent_staff./* See Sections 5.2.6i and 5.2.6iv */



/* the union of G2.1.2.2, G2.1.1.2 and G2.1.2.4: */
six_new_RVSM_flight_levels if 
                     six_new_RVSM_flight_levels_produced_by_competent_staff,
                     six_new_RVSM_flight_levels_validated_by_competent_staff.

six_new_RVSM_flight_levels_produced_by_competent_staff.  /* See Section 5.2.4 and 5.2.6iv */ 
six_new_RVSM_flight_levels_validated_by_competent_staff. /* See Section 5.2.6ii and 5.2.6iv */

                 
/* Section 5.2.7 */           
type hazard527 = {ht_1_8, ht_1_10, ht_2_2, ht_3_6, ht_1_11}. /*identified in the FHA */
type risk527 = risk(H) where H in hazard527.

risks_controlled if 
                  controlled(risk(every hazard527)).
/* the risk is controlled if the hazard (the source) of the risk is mitigated */
controlled(risk527 R) if mitigated(hazard527 H), R = risk(H).
/* the risk is controlled if it believed to be tolerable */
controlled(risk527 R) if tolerable(R).

/* See  section 5.2.8: */
mitigated(ht_1_8).
mitigated(ht_1_10).
mitigated(ht_2_2).
mitigated(ht_3_6).
tolerable(risk(ht_1_11)).

 

/* the union of G2.1.1.4, G 2.1.2.3 and G2.1.2.4: */
contingency_facilities if
                     contingency_facilities_produced_by_competent_staff,
                     contingency_facilities_validated_by_competent_staff.
contingency_facilities_produced_by_competent_staff.  /* See Sections 5.2.5 and 5.2.6iv */
contingency_facilities_validated_by_competent_staff. /* See Sections 5.2.6iii and 5.2.6iv */



                     
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAM A-6~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

/* The following corresponds to strategy St2.2.1 */
fc_procedure_design_complies_with_SRs if
                                      fc_procedures,
                                      states_will_be_required_to_institute_fc,
                                      fc_are_aware_of_EUR_RVSM,
                                      hazards_mitigated.

/* G 2.2.1.1: */
fc_procedures if fc_transition_procedures,
                          fc_rvsm_procedures,
                          fc_flt_planning_procedures,
                          fc_flt_contigency_procedures.


/* The union of (part of) G2.2.1.1  and G2.2.2.1 */
fc_transition_procedures if fc_transition_procedures_produced,
                                     fc_transition_procedures_verified.

fc_transition_procedures_produced. /* Section 5.3.3 */
fc_transition_procedures_verified. /* Section  5.3.6i */

/* The union of (part of) G2.2.1.1  and G2.2.2.2 */
fc_rvsm_procedures if fc_rvsm_procedures_produced,
                               fc_rvsm_procedures_validated.

fc_rvsm_procedures_produced. /* Section 5.3.3 */

fc_rvsm_procedures_validated if fc_rvsm_procedures_proved_by_NAT.
fc_rvsm_procedures_proved_by_NAT. /* Section 5.3.6ii */

/* The union of (part of) G2.2.1.1 and G 2.2.2.3 */
fc_flt_contigency_procedures if fc_flt_contigency_procedures_produced,
                                         fc_flt_contigency_procedures_validated.

fc_flt_contigency_procedures_produced. /* Section 5.3.3 */
fc_flt_contigency_procedures_validated. /* Section 5.3.6 iii */



/* The union of (part of) G2.2.1.1 and G 2.2.2.4 */
fc_flt_planning_procedures if fc_transition_procedures_produced,
                                       fc_flt_planning_procedures_validated.


fc_flt_planning_procedures. /* Section 5.3.3 */
fc_flt_planning_procedures_validated if fc_flt_planning_procedures_proved_by_NAT.
fc_flt_planning_procedures_proved_by_NAT. /* Section 5.3.6 iv */


states_will_be_required_to_institute_fc. /* Section 5.3.4 */
fc_are_aware_of_EUR_RVSM. /* Section 5.3.5 */



/*Section 5.3.7 */
type hazard537 = {ht_3_5, hm_1_8, hm_2_2, hm_1_15}. 

hazards_mitigated if mitigated(every hazard537).

/*Sections 5.3.7 and 5.3.8 */
mitigated(ht_3_5).
mitigated(hm_1_8).
mitigated(hm_2_2).
mitigated(hm_1_15).


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAM A-7~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

aircraft_equipment_design_complies_with_SRs if 
                                      fc_training_design_complies_with_SRs,
                                      fc_transition_training.

/*The following corresponds to strategy St2.3.1*/
fc_training_design_complies_with_SRs if
                                   fc_transition_training, /* which verb? */ 
                                   fc_rvsm_training,
                                   fc_contigency_training,
                                   fc_flt_planning_training,
                                   hazards_mitigated.

/* The union of (part of) G2.3.1.1 and  G2.3.2.1 */
fc_transition_training if fc_transition_training_produced,
                          fc_transition_training_validated.


fc_transition_training_produced. /* Sections 5.4.3 and 5.4.4 */                         
fc_transition_training_validated if fc_transition_training_validated_in_NAT.
fc_transition_training_validated_in_NAT. /* Section 5.4.5 */


/* The union of (part of) G2.3.1.1 and  G2.3.2.1 */
fc_rvsm_training if fc_rvsm_training_produced,
                          fc_rvsm_training_validated.


fc_rvsm_training_produced. /* Sections 5.4.3 and 5.4.4 */                           
fc_rvsm_training_validated if fc_rvsm_training_validated_in_NAT.
fc_rvsm_training_validated_in_NAT. /* Section 5.4.5 */

 
/* The union of G2.3.1.2 and  G2.3.2.1 */
fc_contigency_training if fc_contigency_training_produced,
                          fc_contigency_training_validated.


fc_contigency_training_produced. /* Sections 5.4.3 and 5.4.4  */                          
fc_contigency_training_validated if fc_contigency_training_validated_in_NAT.
fc_contigency_training_validated_in_NAT. /* Section 5.4.5 */


/* The union of G2.3.1.3 and  G2.3.2.1 */
fc_flt_planning_training if fc_flt_planning_training_produced,
                            fc_flt_planning_training_validated.


fc_flt_planning_training_produced. /* Sections 5.4.3 and 5.4.4 */                         
fc_flt_planning_training_validated if fc_flt_planning_training_validated_in_NAT.
fc_flt_planning_training_validated_in_NAT. /* Section 5.4.5 */

hazards_mitigated if mitigated(every hazard546).

/* Section 5.4.6: */
type hazard546 = {ht_1_9, ht_3_5, hm_2_2, hm_1_6, hm_1_8, hm_1_15}.

/*Sections 5.4.6 and 5.4.7: */
mitigated(ht_1_9).
mitigated(ht_3_5).
mitigated(hm_2_2).
mitigated(hm_1_6).
mitigated(hm_1_8). 
mitigated(hm_1_15).

                                      
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAM A-8~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

/* St2.4.1: */
aircraft_equipment_design_complies_with_SRs if
                                      tls_met,
                                      risks_controlled.

/* do hazards affect level of safety?
% if so, should we move hazards_mitigated into the definition tls? */

/*G2.4.1.1.2, Section 5.5.4 */
/* required_height_keeping_accuracy is sufficient to meet TLS */
tls_met if required_height_keeping_accuracy_met.




/* G2.4.1.1.1, Section 5.5.3
 masps is sufficient to meet tls in EUR RVSM. */
required_height_keeping_accuracy_met if masps_height_keeping_accuracy_met.

masps_height_keeping_accuracy_met if crm_valid . /* Section 5.5.2 */

crm_valid. /*Section 5.5.5 */

/* section 5.5.6 */
type hazard556 = {hm_1_3, hm_1_14}.
type risk556 = r(H) where H in hazard556.


/* the risk of a hazard is defined to be the frequence of the occurence of
% the hazard 
% Question: is it a correct definition? */
risks_controlled if 
                  controlled(risk(every hazard556)).

/* the risk is controlled if the hazard (the source) of the risk is mitigated */
controlled(risk556 R) if mitigated(hazard556 H), R = r(H).
/* the risk is controlled if it believed to be tolerable */
controlled(risk556 R) if tolerable(R).

/* See  section 5.5.6: */
tolerable(r(hm_1_14)).
tolerable(r(hm_1_3)).


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAM A-9~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


/*The following corresponds to strategy St2.5.1 */
atc_procedure_design_complies_with_SRs if
                                      atc_transition_procedures,
                                      atc_rvsm_procedures,
                                      atc_contingency_procedures,
                                      atc_clearance_procedures, 
                                      hazards_mitigated.



/* The union of G2.5.1.1  and G2.5.2.1 */
atc_transition_procedures    if atc_transition_procedures_produced,
                               atc_transition_procedures_validated.

atc_transition_procedures_produced. /* Section 5.6.3i */
atc_transition_procedures_validated. /* Section 5.6.4 & Appx B */



/* The union of G2.5.1.2  and G2.5.2.1 */
atc_rvsm_procedures if atc_rvsm_procedures_produced,
                               atc_rvsm_procedures_validated.

atc_rvsm_procedures_produced. /* Section 5.6.3ii */
atc_rvsm_procedures_validated. /* Section 5.6.4 & Appx B */

/* The union of G2.5.1.3  and G2.5.2.1 */
atc_contingency_procedures if         atc_contingency_procedures_produced,
                                       atc_contingency_procedures_validated.

atc_contingency_procedures_produced. /* Section 5.6.3iii */
atc_contingency_procedures_validated./* Section 5.6.4 & Appx B */


/*The union of G2.5.1.4  and G2.5.2.1 */
atc_clearance_procedures if atc_clearance_procedures_produced,
                                       atc_clearance_procedures_validated.

atc_clearance_procedures_produced. /* Section 5.6.3iv */
atc_clearance_procedures_validated. /* Section 5.6.4 & Appx B */


/* Section 5.6.5 */
type hazard565 = {ht_1_1, ht_1_2, ht_1_5, ht_1_8, ht_1_9, ht_2_2, ht_3_5,
          ht_3_6, hm_1_10, hm_1_13, hm_2_1, hm_2_4, hm_2_5, hm_1_9, hm_1_15,
          hm_2_17, hm_2_7, hm_2_9}. 


hazards_mitigated if mitigated(every hazard565).



/* Section 5.6.6: */
mitigated(ht_1_1).
mitigated(ht_1_2).
mitigated(ht_1_5).
mitigated(ht_1_8).
mitigated(ht_1_9).
mitigated(ht_2_2).
mitigated(ht_3_5).
mitigated(ht_3_6).
mitigated(hm_1_10).
mitigated(hm_1_13).
mitigated(hm_2_1). 
mitigated(hm_2_4).
mitigated(hm_2_5). 
mitigated(hm_1_9).
mitigated(hm_1_15).
mitigated(hm_2_17).
mitigated(hm_2_7).
mitigated(hm_2_9).
                 
       
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAM A-10~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
                     
atc_training_design_complies_with_SRs if all_atc_trainings, 
                                         hazards_mitigated.

/* uniion of G2.6.1.1, G2.6.2.1 and G2.6.2.2  */
all_atc_trainings     if all_atc_training_produced_by_competent_staff,
                         all_atc_training_validated.


all_atc_training_produced_by_competent_staff. /* Sections 5.7.3,5.7.4ii */
all_atc_training_validated. /* Section 5.7.4 i */


/* Section 5.7.5 */
type hazard575 = {ht_1_1, ht_1_2, ht_1_5, ht_1_8, ht_1_9, ht_2_2, ht_3_5,
          ht_3_6, hm_1_10, hm_1_13, hm_2_1, hm_2_4, hm_2_5, hm_1_9, hm_1_15,
          hm_2_17, hm_2_7, hm_2_9}. 

hazards_mitigated if mitigated(every hazard575).



/* Section 5.7.6: */
mitigated(ht_1_1).
mitigated(ht_1_2).
mitigated(ht_1_5).
mitigated(ht_1_8).
mitigated(ht_1_9).
mitigated(ht_2_2).
mitigated(ht_3_5).
mitigated(ht_3_6).
mitigated(hm_1_10).
mitigated(hm_1_13).
mitigated(hm_2_1). 
mitigated(hm_2_4).
mitigated(hm_2_5). 
mitigated(hm_1_9).
mitigated(hm_1_15).
mitigated(hm_2_17).
mitigated(hm_2_7).
mitigated(hm_2_9).
                              


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAM A-11~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


/* This corresponds to strategy St 2.7.1 */
atc_equipment_design_complies_with_SRs if
                           modification_made(alert_on_adj_aircraft),
                           modifications_made_to_identify_and_display_apprv_aircraft,
                           fps_oldi_messaged_display_rfl,
                           hazards_mitigated.

 

/* Sections 5.8.* */

type mod_to_identify_and_display_apprv_aircraft  = {ifps, rdps, fdps_fps, oldi, back_up_systems}. 


/* Node G2.7.1.2 */
modifications_made_to_identify_and_display_apprv_aircraft if 
                   modification_made(every   mod_to_identify_and_display_apprv_aircraft).
                   
type modification =mod_to_identify_and_display_apprv_aircraft  + {alert_on_adj_aircraft}.

/* this is to merge nodes G 2.7.1.X/2.7.1.X.Y with G2.7.2.X */
modification_made(modification X) if  modification_specified(X), 
                    complies_with_recommended_practice(X),
                    validated(X).



modification_specified(alert_on_adj_aircraft). /* Section 5.8.3 */
modification_specified(ifps). /* Section 5.8.4 */
modification_specified(rdps). /* Section 5.8.5 */
modification_specified(fdps_fps). /* Section 5.8.6. */
modification_specified(oldi). /* Section 5.8.7. */
modification_specified(back_up_systems). /* Section 5.8.8. */



complies_with_recommended_practice(every modification). /* Section 5.8.9i */
validated(every modification). /* Section 5.8.9ii */



/*
% Question:
% no evidence is provided for fps_oldi_messages_display!!!!!!!!!!!!!!!!!!!!!!!!!
% diagram is also wrong
*/

/*ASSUMPTION*/
 fps_oldi_messaged_display_rfl.
/* END OF ASSUMPTION */

/* Section 5.8.10 */
type hazard5810 = {hm_2_6, hm_2_5, hm_2_17, hm_1_2, hm_2_7, hm_2_8, hm_2_13, 
          hm_2_10, hm_2_11, ht_1_9, hm_2_27}.

hazards_mitigated if mitigated(every hazard5810).


mitigated(every hazard5810). /* Sections 5.8.10 and 5.8.11 */


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAMS A-12 and A-13~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


/* Strategy 2.8.1 */ 
system_monitoring_complies_with_SRs if
                       thke_complient_with_masps,
                       operation_error_rate_verified,
                      /*% Question: should crm_assumptions_are_valid 
                      % be a justification of
                      % something else from lower levels
                      % of the diagram? */                       
                       non_approved_aircraft_excluded,
                       tls_met,
                       hazards_mitigated,
                       assumptions_about_alert_rate_validated.

/*
% Question: Should we remove assumptions_about_alert_rate_validated 
% and non_approved_aircraft_excluded, since they are already inludeed
% into the explanations for mitigated hazards?
*/


/*The union of G2.8.1.1 and G2.8.2.1 % Note, there is a mistake in the diagram,  
                                % the number should be 2.8.2 .. */
thke_complient_with_masps if
                   thke_measured_by_monitors,
                   monitors_validated.

thke_measured_by_monitors. /* Section 5.9.3 */
monitors_validated. /* Section 5.9.9i */

operation_error_rate_verified. /* Section 5.9.4 */

/*
% G2.8.1.3 
% Note that we deattach the node from St2.8.1 and attach it to nodes
% G2.8.1.6 */
crm_assumptions_are_valid if 
        overlap_frequency_verified,
        original_crm_validated_by_nat,
        rvsm_adapted_crm_validated,
        crm_scenarios_valid,
        crm_staff_competent.

overlap_frequency_verified. /*%G2.7.2.1 + Section 5.9.5 */
original_crm_validated_by_nat. /* %G2.7.2.2 + Section 5.9.9ii */
rvsm_adapted_crm_validated. /* % G2.8.2.3 + Section 5.9.9iii */
crm_scenarios_valid.  /* %G2.8.2.4 + Section 5.9.9iv */
crm_staff_competent. /* %G2.8.2.5 + Section 5.9.9v */

non_approved_aircraft_excluded if 
             number_of_non_approved_aircraft_acceptable,
             number_of_approved_aircraft_acceptable.


number_of_non_approved_aircraft_acceptable. /* Section 5.9.3 */
number_of_approved_aircraft_acceptable. /* Section 5.9.6 */

tls_met if crm_shows_tls_met,
           crm_assumptions_are_valid.


crm_shows_tls_met. /* Section 5.9.7 */


assumptions_about_alert_rate_validated. /* Section 5.9.8. */

/* Section 5.9.10 */
type hazard5910 = {hm_2_2, hm_1_1}.

hazards_mitigated if mitigated(every hazard5910).

mitigated(hm_2_2) if  non_approved_aircraft_excluded.
mitigated(hm_1_1) if  assumptions_about_alert_rate_validated.

/*
%Question (just need time to answer): Are hazards disjoint for every diagram?
%If no, should we name them differently?
                   */

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%~DIAGRAM A-14~%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% */
safety_constraints_satisfied if
        safety_proven_for_2001_levels,
        safety_justified_for_2000plus_levels.

safety_proven_for_2001_levels. /* Section 5.10.1i and 5.10.2 */
safety_justified_for_2000plus_levels. /* Section 5.10.1ii */

