package com.kangaroo.wtcoin.data.source.local

import com.kangaroo.miaosha.data.model.params.AlitimeParams
import com.kangaroo.miaosha.data.model.responses.AlitimeResponse
import com.kangraoo.basektlib.data.DataResult
import com.kangraoo.basektlib.data.source.local.BaseLocalDataSource
import com.kangaroo.wtcoin.data.source.AppDataSource
import com.kangaroo.wtcoin.data.model.params.*
import com.kangaroo.wtcoin.data.model.responses.*
import com.qdedu.baselibcommon.data.model.responses.BasicApiResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * 自动生成：by WaTaNaBe on 2021-06-21 16:18.
 * AppLocalDataSource
 */
public class AppLocalDataSource internal constructor(
     private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : BaseLocalDataSource(), AppDataSource {


    /**
     * 自动生成：by WaTaNaBe on 2021-06-21 16:18.
     * #tokenPost#
     * #tokenPost#
     */
    override suspend fun tokenPost(param: TokenPostParams):  DataResult<TokenPostResponse> {
        TODO("Not yet implemented")
    }

    /**
     * 自动生成：by WaTaNaBe on 2021-06-10 15:14.
     * #alitime#
     * #阿里时间#
     */
    override suspend fun alitime(param: AlitimeParams): DataResult<AlitimeResponse> {
        TODO("Not yet implemented")
    }

//#06#
}
