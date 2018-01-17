
package com.easy.springboot.demo_using_gradle_plugin.controller
import com.easy.springboot.demo_using_gradle_plugin.dao.KorDao
import com.easy.springboot.demo_using_gradle_plugin.entity.Kor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import javax.servlet.http.HttpServletRequest
/**
     * Created by Kor on 2018-01-17 22:42:55. author: 东海陈光剑
     */
@RestController
@RequestMapping("/kor")
class KorController {
    @Autowired lateinit var KorDao: KorDao
    @GetMapping(value = ["/"])
    fun kor(request: HttpServletRequest): List<Kor>{
        return KorDao.findAll()
    }
    @GetMapping(value = ["/{id}"])
    fun getOne(@PathVariable("id") id:Long): Kor {
        return KorDao.getOne(id)
    }
}
