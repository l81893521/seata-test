package com.zhangjiawei.service;

import com.zhangjiawei.dto.SaveAccountReq;

/**
 * @description:
 * @author: zhangjiawei
 * @date: 2023/9/28
 */
public interface AccountService {

    /**
     * 保存账户
     * @param saveAccountReq
     */
    String saveAccountNormal(SaveAccountReq saveAccountReq);

    /**
     * 保存账号(指定列)
     * @param saveAccountReq
     * @return
     */
    String saveAccountSpecificColumn(SaveAccountReq saveAccountReq);

    /**
     * 保存账号(自增)
     * @param saveAccountReq
     * @return
     */
    String saveAccountAutoincrement(SaveAccountReq saveAccountReq);

    /**
     * 保存账号(函数)
     * @param saveAccountReq
     * @return
     */
    String saveAccountFunction(SaveAccountReq saveAccountReq);

    /**
     * 保存账号(null)
     * @param saveAccountReq
     * @return
     */
    String saveAccountNull(SaveAccountReq saveAccountReq);

    /**
     * 保存账号(tableSchema.tableName)
     * @param saveAccountReq
     * @return
     */
    String saveAccountTableSchemaAndTableName(SaveAccountReq saveAccountReq);

    /**
     * 保存账号(tableSchema.'tableName')
     * @param saveAccountReq
     * @return
     */
    String saveAccountTableSchemaAndTableNameWithQuote(SaveAccountReq saveAccountReq);

    /**
     * 保存账号('tableSchema'.tableName)
     * @param saveAccountReq
     * @return
     */
    String saveAccountTableSchemaWithQuoteAndTableName(SaveAccountReq saveAccountReq);

    /**
     * 保存账号('tableSchema'.'tableName')
     * @param saveAccountReq
     * @return
     */
    String saveAccountTableSchemaWithQuoteAndTableNameWithQuote(SaveAccountReq saveAccountReq);

    /**
     * 保存账号(联合主键)
     * @param saveAccountReq
     * @return
     */
    String saveAccountMultiPk(SaveAccountReq saveAccountReq);
}
