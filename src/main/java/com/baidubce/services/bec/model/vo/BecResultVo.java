/*
 * Copyright (c) 2020 Baidu.com, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.bec.model.vo;

import com.baidubce.model.AbstractBceResponse;
import lombok.Data;

/**
 * BEC return result.
 */
@Data
public class BecResultVo<T> extends AbstractBceResponse {

    /**
     * Return result.
     */
    public T result;

    /**
     * Whether the operation was successful.
     */
    public boolean success;

    public BecResultVo() {
    }

    public BecResultVo(T result) {
        this.result = result;
        success = true;
    }
}
