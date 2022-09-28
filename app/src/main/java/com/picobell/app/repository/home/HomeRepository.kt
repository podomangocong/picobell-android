package com.picobell.app.repository.home

import com.picobell.app.model.HomeData
import com.picobell.app.repository.home.HomeAssetDataSource

class HomeRepository(
    private val assetDataSource: HomeAssetDataSource
) {

    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeData()
    }

    fun getHomeData2(): HomeData? {
        return assetDataSource.getHomeData()
        // assetloader로부터 json포맷의 데이터를 가져와서 string -> 프로젝트 객체로 바꿔주던 기능을 기존에는 homefragment에서 해줬는데 아키텍쳐 기반으로 레이어를 구성한 후에는 homeAssetDataSource에서
    }
}

