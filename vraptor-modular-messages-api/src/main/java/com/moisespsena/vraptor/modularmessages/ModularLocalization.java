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

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import br.com.caelum.vraptor.core.Localization;

import com.moisespsena.vraptor.modular.Module;

/**
 * @see br.com.caelum.vraptor.core.Localization
 * @author Moises P. Sena &lt;moisespsena@gmail.com&gt;
 * @since 1.0 29/06/2011
 * 
 */
public interface ModularLocalization extends Localization {
	/**
	 * Get the resource bundle for current locale on module. If the resource
	 * bundle is not found, an empty resource bundle is returned, to avoid
	 * {@link MissingResourceException}.
	 * 
	 * @param module
	 *            The module of ResourceBundle
	 */
	public ResourceBundle getBundle(final Module module);

	/**
	 * Returns a formated message or '???key???' if the key was not found on
	 * ResourceBundle of module.
	 * 
	 * @param module
	 * @param key
	 * @param parameters
	 * @see #getBundle(Module)
	 */
	public String getMessage(final Module module, final String key,
			final Object... parameters);

	/**
	 * Retorna a mensagem formatada our '???key???' se key nao existir.
	 * 
	 * Se a chave casar no padrao
	 * <strong>_&lt;moduleName&gt;.&lt;key&gt;</strong> o nome do modulo e a
	 * chava será extraída da chave passada e a mensagem sera buscada no
	 * {@link ResourceBundle} do modulo em questao:
	 * 
	 * <pre>
	 * <code>String <strong>key</strong> = "my.key";
	 * String <strong>moduleName</strong> = "myModule";
	 * 
	 * Module module = modulesFactory.getModule(<strong>moduleName</strong>);
	 * String messageByModule = localization.getMessage(module, <strong>key</strong>);</code>
	 * </pre>
	 * 
	 * é equivalente a
	 * 
	 * <pre>
	 * <code>String message = localization.getMessage("_" + <strong>moduleName</strong> + "." + <strong>key</strong>);
	 * </code>
	 * </pre>
	 * 
	 * @param key
	 *            A chave da mensagem
	 * @param parameters
	 * @see Localization#getMessage(String, Object...)
	 */
	@Override
	public String getMessage(final String key, final Object... parameters);

	/**
	 * Return no formated message using {@link MessageFormat}
	 * 
	 * @param module
	 * @param key
	 */
	public String getRawMessage(final Module module, final String key);

	/**
	 * Return no formated message using {@link MessageFormat}
	 * 
	 * @param key
	 */
	public String getRawMessage(final String key);

	/**
	 * Returns the message of Request Module
	 * 
	 * @param key
	 * @param parameters
	 * @see #getMessage(String, Object...)
	 */
	public String getRequestMessage(final String key,
			final Object... parameters);
}
