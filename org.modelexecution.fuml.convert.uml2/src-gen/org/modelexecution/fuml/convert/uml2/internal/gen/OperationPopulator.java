/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package org.modelexecution.fuml.convert.uml2.internal.gen;
    	
import javax.annotation.Generated;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.uml2.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.uml2.gen.ElementPopulatorGenerator.xtend")
public class OperationPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
			
		if (!(uml2Element instanceof org.eclipse.uml2.uml.Operation) ||
			!(fumlElement instanceof fUML.Syntax.Classes.Kernel.Operation)) {
			return;
		}
		
		fUML.Syntax.Classes.Kernel.Operation fumlNamedElement = (fUML.Syntax.Classes.Kernel.Operation) fumlElement;
		org.eclipse.uml2.uml.Operation uml2NamedElement = (org.eclipse.uml2.uml.Operation) uml2Element;
		
		fumlNamedElement.upper = new UMLPrimitiveTypes.UnlimitedNatural();
		fumlNamedElement.isQuery = uml2NamedElement.isQuery();
		fumlNamedElement.isOrdered = uml2NamedElement.isOrdered();
		fumlNamedElement.isUnique = uml2NamedElement.isUnique();
		fumlNamedElement.lower = uml2NamedElement.getLower();
		fumlNamedElement.upper = new UMLPrimitiveTypes.UnlimitedNatural();
		fumlNamedElement.upper.naturalValue = uml2NamedElement.getUpper();
		fumlNamedElement.class_ = (fUML.Syntax.Classes.Kernel.Class_) result
							.getFUMLElement(uml2NamedElement.getClass_());
		
		for (org.eclipse.uml2.uml.Operation value : uml2NamedElement.getRedefinedOperations()) {
					fumlNamedElement.redefinedOperation.add((fUML.Syntax.Classes.Kernel.Operation) result.getFUMLElement(value));
		}
		
		fumlNamedElement.type = (fUML.Syntax.Classes.Kernel.Type) result
							.getFUMLElement(uml2NamedElement.getType());
		
		
		
		
	}
	
}