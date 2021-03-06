/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.css.editor.module.main;

/**
 *
 * @author mfukala@netbeans.org
 */
public class Transforms3DTest extends CssModuleTestBase {

    public Transforms3DTest(String testName) {
        super(testName);
    }
  
    public void testProperties() {
        assertPropertyValues("backface-visibility", "visible", "hidden");
        assertPropertyValues("perspective", "none", "5");
        
        assertPropertyValues("perspective-origin", "10%", "5px", "left", "center", "right");
        assertPropertyValues("perspective-origin", "10% 20px", "5px 5%", "left top", "center 10%", "left bottom");
        
        assertPropertyValues("transform", "none", "rotate(10deg)");
        
        assertPropertyValues("transform", "rotateX(10deg)", "rotateY(2rad)");
    }
    
}
