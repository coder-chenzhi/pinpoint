/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.common.util;

import com.navercorp.pinpoint.common.AnnotationKeyMatcher;
import com.navercorp.pinpoint.common.ServiceType;

/**
 * @author emeroad
 */
public class DisplayArgumentMatcher {
    private final ServiceType serviceType;
    private final AnnotationKeyMatcher annotationKeyMatcher;

    public DisplayArgumentMatcher(ServiceType serviceType, AnnotationKeyMatcher annotationKeyMatcher) {
        if (serviceType == null) {
            throw new NullPointerException("serviceType must not be null");
        }
        if (annotationKeyMatcher == null) {
            throw new NullPointerException("annotationKeyMatcher must not be null");
        }
        this.serviceType = serviceType;
        this.annotationKeyMatcher = annotationKeyMatcher;
    }

    public AnnotationKeyMatcher getAnnotationKeyMatcher() {
        return annotationKeyMatcher;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }
}
