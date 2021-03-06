/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.vr;

import com.oculusvr.capi.OvrLibrary;

/**
 * @author Daniel Holderbaum
 */
public class OculusImplementation implements VirtualRealityImplementation {

	public OculusImplementation() {
		VirtualReality.implementation = this;
	}

	@Override
	public void initialize() {
		OvrLibrary.INSTANCE.ovr_Initialize();
		VirtualReality.headMountedDisplay = new OculusHMD(OvrLibrary.INSTANCE.ovrHmd_CreateDebug(0));
	}

	@Override
	public void shutdown() {
		OvrLibrary.INSTANCE.ovr_Shutdown();
	}

	@Override
	public boolean supportsAntiDistortion() {
		return true;
	}

	@Override
	public void addDeviceListener(VirtualRealityDeviceListener listener) {
	}

	@Override
	public void removeDeviceListener(VirtualRealityDeviceListener listener) {
	}

}
