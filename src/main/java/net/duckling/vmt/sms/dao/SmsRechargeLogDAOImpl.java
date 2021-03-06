/*
 * Copyright (c) 2008-2016 Computer Network Information Center (CNIC), Chinese Academy of Sciences.
 * 
 * This file is part of Duckling project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 */
package net.duckling.vmt.sms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.duckling.cloudy.db.simpleORM.repository.BaseDAO;
import net.duckling.vmt.sms.domain.SmsRechargeLog;
@Repository
public class SmsRechargeLogDAOImpl implements ISmsRechargeLogDAO{
	@Autowired
	private BaseDAO<SmsRechargeLog> baseDAO;
	@Override
	public void addLog(SmsRechargeLog log) {
		baseDAO.insert(log);
		
	}@Override
	public List<SmsRechargeLog> findLogsByGid(int gid) {
		SmsRechargeLog srl=new SmsRechargeLog();
		srl.setGroupId(gid);
		return baseDAO.select(srl," order by `id` desc");
	}

}
