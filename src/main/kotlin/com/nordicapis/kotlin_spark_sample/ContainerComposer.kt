/*
Copyright (C) 2015 Nordic APIs AB

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

ContainerComposer.kt - The composer that wires up the dependencies of this application
*/

package com.nordicapis.kotlin_spark_sample

import org.picocontainer.DefaultPicoContainer
import org.picocontainer.MutablePicoContainer
import kotlin.reflect.jvm.java

class ContainerComposer : Composable
{
    public override fun composeApplication(appContainer: MutablePicoContainer)
    {
        appContainer.addComponent(javaClass<AuthorizeController>())
        appContainer.addComponent(javaClass<TokenController>())
        appContainer.addComponent(javaClass<LoginController>())
    }

    public override fun composeRequest(container: MutablePicoContainer)
    {
    }
}
