package com.example.medipredict

import io.flutter.embedding.android.FlutterActivity

class MainActivity : FlutterActivity()

import ...

val supabase = createSupabaseClient(
    supabaseUrl = "https://xyzcompany.supabase.co",
    supabaseKey = "your_publishable_key"
  ) {
    install(Postgrest)
}
...

@Serializable
data class Instrument(
    val id: Int,
    val name: String,
)