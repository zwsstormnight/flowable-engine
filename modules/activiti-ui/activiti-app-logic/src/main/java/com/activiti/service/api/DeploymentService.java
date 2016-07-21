/* Licensed under the Apache License, Version 2.0 (the "License");
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
package com.activiti.service.api;

import java.util.List;

import org.activiti.engine.identity.User;
import org.springframework.transaction.annotation.Transactional;

public interface DeploymentService {

    @Transactional
    void deployAppDefinitions(List<Long> appDefinitions, User user);
    
    @Transactional
    DeploymentResult updateAppDefinition(Long appDefinitionId, String appDefinitionName, 
            String appDefinitionDescription, String appDefinitionJson, User user);

    @Transactional
    void deleteAppDefinition(Long appDefinitionId);

}