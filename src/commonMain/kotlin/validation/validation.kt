package validation

data class Framework(val name: String)

fun <D, M> validation(validate: (D) -> M): (D, Unit?) -> M = { data, _ -> validate(data) }

operator fun <D, M> ((D, Unit?) -> M).invoke(data: D): M = this(data, null)