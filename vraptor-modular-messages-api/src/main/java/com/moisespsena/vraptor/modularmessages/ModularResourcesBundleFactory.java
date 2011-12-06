/***
 * Copyright (c) 2011 Moises P. Sena - www.moisespsena.com
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package com.moisespsena.vraptor.modularmessages;

import java.util.Locale;
import java.util.ResourceBundle;

import com.moisespsena.vraptor.modular.Module;

/**
 * 
 * @author Moises P. Sena &lt;moisespsena@gmail.com&gt;
 * @since 1.0 29/06/2011
 * 
 */
public interface ModularResourcesBundleFactory {
	public ResourceBundle getBundle(final Module module);

	public ResourceBundle getBundle(final String modulename);

	public ResourceBundle getDefaultBundle();

	public Locale getFallbackLocale();

	public Locale getLocale();

	public ResourceBundle getRequestBundle();
}
