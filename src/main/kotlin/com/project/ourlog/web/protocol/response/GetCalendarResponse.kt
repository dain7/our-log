package com.project.ourlog.web.protocol.response

import com.project.ourlog.domain.entity.Date

data class GetCalendarResponse(
        var calendar : List<Date>
) {
}