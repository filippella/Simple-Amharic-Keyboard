/*
 * Copyright (c) 2016 Filippo Engidashet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dalol.simpleamharickeyboard.keyboard.keys;

/**
 * @author Filippo Engidashet <filippo.eng@gmail.com>
 * @version 1.0.0
 * @since 12/18/2016
 */
public class KeyInfo {

    private final String keyLabel;
    private final float keyWeight;
    private final boolean modifierEnabled;

    public KeyInfo(String keyLabel, float keyWeight, boolean modifierEnabled) {
        this.keyLabel = keyLabel;
        this.keyWeight = keyWeight;
        this.modifierEnabled = modifierEnabled;
    }

    public String getKeyLabel() {
        return keyLabel;
    }

    public float getKeyWeight() {
        return keyWeight;
    }

    public boolean isModifierEnabled() {
        return modifierEnabled;
    }
}
