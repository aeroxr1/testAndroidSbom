package com.testsbom.testmodule

import com.fasterxml.jackson.databind.ObjectMapper
import com.testsbom.testbasemodule.TestImportInterface

class TestImport: TestImportInterface {
    override fun helloWorld():String{
        val jsonObject = ObjectMapper().createObjectNode()
        return "Hello Google!"
    }
}