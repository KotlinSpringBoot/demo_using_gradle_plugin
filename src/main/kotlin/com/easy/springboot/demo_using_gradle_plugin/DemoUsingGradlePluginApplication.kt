package com.easy.springboot.demo_using_gradle_plugin

import com.easy.springboot.demo_using_gradle_plugin.dao.KorDao
import com.easy.springboot.demo_using_gradle_plugin.entity.Kor
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.support.beans

@SpringBootApplication
class DemoUsingGradlePluginApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder().initializers(
            beans {
                bean {
                    ApplicationRunner {
                        /** 初始化测试数据 */
                        val korDao = ref<KorDao>()
                        val kor = Kor()
                        korDao.save(kor)
                    }
                }
            }
    ).sources(DemoUsingGradlePluginApplication::class.java).run(*args)
}
