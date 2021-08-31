/*******************************************************************************
 * Copyright (c) 2014
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Daniel Kojic - initial API and implementation and/or initial documentation
 *    Benjamin Klatt
 *******************************************************************************/
package org.splevo.diffing;

import org.splevo.commons.registry.IdBasedRegistryBase;

/**
 * A registry for available differencing engines.
 */
public enum DifferRegistry {
    INSTANCE;
    
    private final InnerDifferRegistry innerRegistry = new InnerDifferRegistry();
    
    /**
     * @return The singleton instance.
     */
    public static InnerDifferRegistry getInstance() {
        return INSTANCE.innerRegistry;
    }
    
    /**
     * Implementation class for the differencing engines registry.
     */
    public class InnerDifferRegistry extends IdBasedRegistryBase<Differ, String> {
        
        @Override
        protected int compareElements(Differ element1, Differ element2) {
            return element1.getOrderId() - element2.getOrderId();
        }

    }
    
}


