
package com.easy.springboot.demo_using_gradle_plugin.entity
import javax.persistence.*
import java.util.Date
/**
     * Created by Kor on 2018-01-17 22:42:55. author: 东海陈光剑
     */
@Entity
class Kor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1
    var gmtCreate = Date()
    var gmtModify = Date()
    var isDeleted = 0
}
