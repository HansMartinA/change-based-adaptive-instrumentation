/*
 * generated by Xtext 2.24.0
 */
package tools.vitruv.dsls.reactions.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.validation.XbaseValidator;

public abstract class AbstractReactionsLanguageValidator extends XbaseValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(tools.vitruv.dsls.reactions.language.LanguagePackage.eINSTANCE);
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://vitruv.tools/dsls/reactions/language/toplevelelements"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://vitruv.tools/dsls/common/elements"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/xbase/Xbase"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/common/JavaVMTypes"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/xbase/Xtype"));
		return result;
	}
}
