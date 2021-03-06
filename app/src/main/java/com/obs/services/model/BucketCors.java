/**
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.obs.services.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 桶的跨域资源共享配置
 */
public class BucketCors extends S3BucketCors
{
    private List<BucketCorsRule> rules;
    
    public BucketCors()
    {
    }
    
    /**
     * 构造函数
     * @param rules 桶的跨域资源共享规则列表
     */
    public BucketCors(List<BucketCorsRule> rules)
    {
        this.rules = rules;
    }
    
    /**
     * 获取桶的跨域资源共享规则列表
     * @return 桶的跨域资源共享规则列表
     */
    public List<BucketCorsRule> getRules()
    {
        if (null == rules)
        {
            rules = new ArrayList<BucketCorsRule>();
        }
        return rules;
    }
    
    /**
     * 设置桶的跨域资源共享规则列表
     * @param rules 桶的跨域资源共享规则列表
     */
    public void setRules(List<BucketCorsRule> rules)
    {
        this.rules = rules;
    }
    
    
    @Override
    public String toString()
    {
        return "ObsBucketCors [rules=" + rules + "]";
    }
}
