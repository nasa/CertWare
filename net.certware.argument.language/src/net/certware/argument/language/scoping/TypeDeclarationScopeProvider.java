package net.certware.argument.language.scoping;

import java.util.List;

import net.certware.argument.language.l.LPackage;
import net.certware.argument.language.l.Program;
import net.certware.argument.language.l.TypeId;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Provides a scope provider for universal quantifier type ID references.
 * Presumes the type IDs were previously defined in scope.
 * @author mrb
 */
public class TypeDeclarationScopeProvider implements IScopeProvider {

	@Inject // obtain the next ScopeProvider in the hierarchy
	@Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	private IScopeProvider delegate;

	// debug -- invoked? 
	TypeDeclarationScopeProvider() {
		super();
		System.err.println("scope provider constructed");
	}
	
	/**
	 * Overrides the abstract method to find program container and defined types.
	 * If not in universal quantified term name context, delegate to super class.
	 */
	public IScope getScope(EObject context, EReference reference) {
		System.err.println("reference " + reference);
	/*	if (reference == LPackage.Literals.UNIVERSAL_QUANTIFIED_TERM__NAME) {
			System.err.println("Finding uqt scope for " + context);
			Program program = EcoreUtil2.getContainerOfType(context, Program.class);
			return getTypeIdScope(program);
		}
		if ( reference == LPackage.Literals.EXISTENTIAL_QUANTIFIED_TERM__NAME) {
			System.err.println("Finding eqt scope for " + context);
			Program program = EcoreUtil2.getContainerOfType(context, Program.class);
			return getTypeIdScope(program);
		}
		if (reference == LPackage.Literals.TVAR__ID) {
			System.err.println("Finding tvar scope for " + context);
			Program program = EcoreUtil2.getContainerOfType(context, Program.class);
			return getTypeIdScope(program);
		}
		*/
		return delegate.getScope(context, reference);
	}
	
	private IScope getTypeIdScope(Program program) {
		// never return null, rather NULLSCOPE
		if ( program == null )
			return IScope.NULLSCOPE;
		
		// build some scope to include all TypeID elements, simple names
		List<TypeId> allIds = EcoreUtil2.getAllContentsOfType(program,TypeId.class);
		return Scopes.scopeFor(allIds);
	}

}
