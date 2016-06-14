/*
 * Copyright (c) 2016-2026. DesignThoughts Axon Sample
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
package cn.designthoughts.sample.axon.sfav.customer.entry;

import org.springframework.data.repository.CrudRepository;
/**
 * @author Thomas Yuan
 */
public interface CustomerEntryRepository extends CrudRepository<CustomerEntry, Long>{
	public CustomerEntry save(CustomerEntry customerEntry);
	public CustomerEntry findById(Long id);
	public CustomerEntry findByIdentifier(String identifier);
	public CustomerEntry findByNickName(String nickName);
	public CustomerEntry findByEmailAddress(String emailAddress);
	public CustomerEntry findByMobileNumber(String mobileNumber);
}
