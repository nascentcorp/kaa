/*
 * Copyright 2014 CyberVision, Inc.
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
package org.kaaproject.kaa.client.profile;

import java.io.IOException;

import org.kaaproject.kaa.common.avro.AvroByteArrayConverter;
import org.kaaproject.kaa.schema.base.Profile;

/**
 * This class serialize entity defined in profile schema and returned by profile container.
 * This class have a special behavior in case of default schema and serialize default profile disregarding empty profile container.
 * 
 * This implementation is auto-generated. Please modify corresponding template file.
 * 
 * @author Andrew Shvayka
 *
 */
class ProfileSerializer {
    private final AvroByteArrayConverter<Profile> converter = new AvroByteArrayConverter<Profile>(Profile.class);

    byte[] toByteArray(ProfileContainer container) throws IOException {
        if(container == null){
            throw new RuntimeException("Profile container is not set!");
        }
        Profile profile = container.getProfile();
        if(profile != null){
            return converter.toByteArray(profile);
        }else{
            throw new RuntimeException("Profile is not set!");
        }
    }
}
