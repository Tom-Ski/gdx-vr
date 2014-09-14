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

/**
 * @author Daniel Holderbaum
 */
public interface DisplayMetaInformation {

	/**
	 * Returns the device model string.
	 * 
	 * @return A string identifying the current device model.
	 */
	String getModel();

	/**
	 * Returns the device vendor string.
	 * 
	 * @return A string identifying the device vendor.
	 */
	String getVendor();

	/**
	 * Returns the device manufacturer string.
	 * 
	 * @return A string identifying the device manufacturer.
	 */
	String getManufacturer();

	/**
	 * Returns the device version string.
	 * 
	 * @return A string identifying the current device version.
	 */
	String getVersion();

}
