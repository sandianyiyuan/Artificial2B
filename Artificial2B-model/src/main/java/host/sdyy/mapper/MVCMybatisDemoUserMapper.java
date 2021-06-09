/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package host.sdyy.mapper;

import host.sdyy.entity.MVCMybatisDemoUser;

import org.apache.ibatis.annotations.Mapper;


/**
 * 指定这是一个操作数据库的mapper
 *
 * @author paida 派哒 zeyu.pzy@alibaba-inc.com
 */
//@Mapper       // 配置中已经写了@MapperScan("host.sdyy.mapper")
                // 会扫描这个包下面的所有接口类，可以不用单独写@Mapper注解了
public interface MVCMybatisDemoUserMapper {
    MVCMybatisDemoUser queryUserInfo(String id);
}
