package com.example.recyclerview_aula11

class MusicaData {

    fun loadItems(): List<Album> = listOf(
        Album(
            image = R.drawable.ic_baseline_library_music_24,
            name = "Tempo Feliz (samba, 1965)",
            time = "03:20"
        ),
        Album(
            image = R.drawable.ic_baseline_music_note_24,
            name = "Oração ao Tempo (MPB, 1979)",
            time = "04:20"
        ),
        Album(
            image = R.drawable.ic_baseline_music_off_24,
            name = "Novo Tempo (MPB, 1980)",
            time = "02:27"
        ),
        Album(
            image = R.drawable.ic_baseline_music_note_24,
            name = "Tempo Rei (MPB, 1984) ",
            time = "03:20"
        ),
        Album(
            image = R.drawable.ic_baseline_library_music_24,
            name = "Tempo Perdido (rock, 1986)",
            time = "04:20"
        ),
        Album(
            image = R.drawable.ic_baseline_music_off_24,
            name = "O Tempo Não Para (rock, 1988)",
            time = "02:20"
        ),
        Album(
            image = R.drawable.ic_baseline_library_music_24,
            name = "Sobre o Tempo (pop, 1995)",
            time = "01:22"
        ),
        Album(
            image = R.drawable.ic_baseline_music_note_24,
            name = "Resposta ao Tempo (bossa nova, 1998)",
            time = "05:22"
        ),
        Album(
            image = R.drawable.ic_baseline_music_off_24,
            name = "Templo do Tempo (MPB, 2015) ",
            time = "03:24"
        ),
        Album(
            image = R.drawable.ic_baseline_music_note_24,
            name = "Tempo da Estiagem (samba, 2020)",
            time = "02:20"
        ),
        Album(
            image = R.drawable.ic_baseline_library_music_24,
            name = "O Mundo é um Moinho",
            time = "01:45"
        ),
    )
}