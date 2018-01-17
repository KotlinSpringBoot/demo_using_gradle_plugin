
package com.easy.springboot.demo_using_gradle_plugin.dao
import com.easy.springboot.demo_using_gradle_plugin.entity.Kor
import org.springframework.data.jpa.repository.JpaRepository
/**
     * Created by Kor on 2018-01-17 22:42:55. author: 东海陈光剑
     */
interface KorDao : JpaRepository<Kor, Long> {
}
