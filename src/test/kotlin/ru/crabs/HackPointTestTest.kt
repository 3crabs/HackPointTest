package ru.crabs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest

@MicronautTest
class HackPointTestTest : StringSpec() {

    init {
        "1 eq 1" {
            1 shouldBe 1
        }
    }
}
