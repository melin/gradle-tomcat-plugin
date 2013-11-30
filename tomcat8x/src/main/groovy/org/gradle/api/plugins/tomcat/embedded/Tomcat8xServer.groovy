/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.plugins.tomcat.embedded

import java.lang.reflect.Constructor

/**
 * Tomcat 8x server implementation.
 *
 * @author Andrey Bloschetsov
 */
class Tomcat8xServer extends Tomcat7xServer {
    @Override
    TomcatVersion getVersion() {
        TomcatVersion.VERSION_8X
    }

    @Override
    void setRealm(realm) {
        tomcat.engine.realm = realm
    }
}