/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import java.lang.annotation.Documented;

/**
 * Annotation for Copyright which will be included in javadoc rendering.  
 * @author Tom Digre
 *
 */
@Documented
@Copyright(notice="NIEM UML  <br/><br/>"+   
		"Copyright © 2011, ModelDriven.org and Tom Digre, all rights reserved worldwide.<br/><br/>"+  
		"This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.<br/><br/>"+
		"This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details. <br/><br/>"+
		
		"You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/gpl-3.0-standalone.html.<br/><br/>"+ 		
		"There are also commercial licenses available for this software.  Contact ModelDriven.org for more information."+
		"")
public @interface Copyright {
	/**
	 * The content of the copyright notice.  
	 * @return The content of the copyright notice.
	 */
	String notice();
}
