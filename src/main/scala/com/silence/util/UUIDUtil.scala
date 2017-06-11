package com.silence.util

import java.util.UUID

/**
 * UUID工具
 * @dete 2017-04-05
 * @author silence
 */
object UUIDUtil {
    
    /**
     * 64位随机UUID
     * @return String
     */
    def getUUID64String(): String = (UUID.randomUUID.toString + UUID.randomUUID.toString).replace("-", "")
    
    /**
     * 32位随机UUID
     * @return String
     */
    def getUUID32String(): String = UUID.randomUUID.toString.replace("-", "")

}