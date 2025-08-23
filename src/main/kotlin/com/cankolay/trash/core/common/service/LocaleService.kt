package com.cankolay.trash.core.common.service

import org.springframework.context.i18n.LocaleContextHolder
import org.springframework.stereotype.Service
import java.util.*

@Service
class LocaleService {
    fun get(): Locale = LocaleContextHolder.getLocale()
}