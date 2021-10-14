package com.example.myrabbithole

object Hololive_Idols {
    private val HololiveIdolNames = arrayOf(
            "Nakiri Ayame",
            "Shirakami Fubuki",
            "Amelia Watson",
            "Inugami Korone",
            "Himemori Luna",
            "Sakura Miko",
            "Shishiro Botan",
            "Momosuzu Nene",
            "Uruha Rushia",
            "Tsunomaki Watame"
    )
    private val HololiveIdolsImage = arrayOf(
            R.drawable.ayame,
            R.drawable.fubuki,
            R.drawable.amelia_watson,
            R.drawable.korone,
            R.drawable.luna,
            R.drawable.mikochi,
            R.drawable.ssrb,
            R.drawable.super_nenechi,
            R.drawable.uruha_rushia,
            R.drawable.watame
    )
    private val HoloLiveIdolsChannel = arrayOf(
        "https://www.youtube.com/channel/UC7fk0CB07ly8oSl0aqKkqFg",
        "https://www.youtube.com/channel/UCdn5BQ06XqgXoAxIhbqw5Rg",
        "https://www.youtube.com/channel/UCyl1z3jo3XHR1riLFKG5UAg",
        "https://www.youtube.com/channel/UChAnqc_AY5_I3Px5dig3X1Q",
        "https://www.youtube.com/channel/UCa9Y57gfeY0Zro_noHRVrnw",
        "https://www.youtube.com/channel/UC-hM6YJuNYVAmUWxeIr9FeA",
        "https://www.youtube.com/channel/UCUKD-uaobj9jiqB-VXt71mA",
        "https://www.youtube.com/channel/UCAWSyEs_Io8MtpY3m-zqILA",
        "https://www.youtube.com/channel/UCl_gCybOJRIgOXw6Qb4qJzQ",
        "https://www.youtube.com/channel/UCqm3BQLlJfvkTsX_hvm0UmA",


    )
//    private val HololiveIdolsPersonality = arrayOf(
//    "Nakiri Ayame adalah Oni(Iblis Jepang) Vtuber generasi ke-2 di Hololive, Karakter Nakiri Ayame sangat Ceria dan Friendly terhadap semua penonton dan rekan idolnya, Ayame sangat terkenal dengan ketawanya yang banyak disukai orang",
//    "Shirakami Fubuki merupakan Vtuber dari Hololive generasi ke-1 dan juga merupakan bagian dari Hololive Gamers, Fubuki bersifat ceria dan sangat menyukai memes terkadang fubuki membuat video pendek untuk menghibur fansnya",
//    "Amelia Watson adalah Vtuber generasi ke-1 dari Hololive English, Amelia terkenal dengan sifat yang mudah marah ketika kalah dari game dan sering melakukan kekerasan terhadap kontroler yang dia gunakan, ketika marah suara amelia akan seperti gremlin",
//    "Inugami Korone adalah Vtuber dari Hololive Gamers, dia terkenal dengan sifat yanderenya karena selalu meminta jari para penontonnya, dia juga memiliki aksen bicara yang sangat unik dibandingkan dengan idol hololive yang lain",
//    "Himemori Luna adalah Vtuber Hololive dari genereasi ke-4, Luna terkenal karena karakternya yang seperti bayi dan memiliki sifat himepu(Princess Manja)",
//    "Sakura Miko adalah Vtuber dari Hololive generasi ke-0, Miko terkenal dengan sebutan sang elite gamers, karena selalu melakukan hal-hal elite yang tidak bisa dilakukan oleh holomem lainnya",
//    "Shishiro Botan merupakan Vtuber dari Hololive generasi ke-5 terkenal dengan kehandalannya dalam bermain game dan para fans sangat menyukai cara botan tertawa",
//    "Momosuzu Nene merupakan genmates Botan terkenal dengan sifat yang sangat ceria dan sangat disukai oleh fansnya karena nene memiliki sifat dorky",
//    "Uruha Rushia merupakan Vtuber dari Hololive generasi ke-3, Rushia memiliki sifat yang ramah dan baik hati akan tetapi apabila rushia marah maka ia akan berteriak seperti penyanyi metal",
//    "Tsunomaki Watame adalah Vtuber Hololive generasi ke-4, memiliki sifat yang ceria, ia juga terkenal dengan konser malamnya karena watame sangant senang bernyanyi"
//    )
    private val HololiveIdolsPersonality = arrayOf(
    "Ayame is an oni who seems to talk to humans as if they are below her. However in spite of this, she is very friendly, playful and treats her audience equally to herself. Even sometimes looking up to humans she respects such as Houshou Marine to where she had difficulties approaching her.",
    "Fubuki is usually always cheerful and excited, singing little songs and making many in-jokes. She is shy when confronted with new circumstances, and when embarrassed she \"hides\" at the bottom of the screen with only her fox ears peeking up. She becomes enthralled in games and has cute conversations with scripted game characters, or voice acts as characters while making effects",
    "Amelia is a rather eccentric girl who is often seen mingling or teasing her fellow holoMyth members. She is usually kind, supportive, and sweet as shown when she frequently watches her fellow members' streams and often willingly helps Gura in Minecraft. However Amelia also likes to joke around with the other members and sometimes even doing lewd remarks such as naming one of her mines in Minecraft \"Gura's Backdoor.\"",
    "Korone has a sweet and goofy personality comparable to that of an actual dog. She often kisses other hololive members for no reason, and has a high-pitched laugh that resembles a train whistle or flute.\n" +
            "\n" +
            "Like most dogs, Korone is fiercely loyal, specifically to Nekomata Okayu. The two are rarely seen apart, and the pair is known as \"OkaKoro\".",
    "Luna has a sweet and innocent personality, although due of her status as the Princess of Candy Kingdom and as the youngest hololive member, she is a bit pampered and always asks for the older hololive members' attention, especially Natsuiro Matsuri's. In recent streams, Luna also showed hints of sadism and yandere personalities traits although it's not that prominent.\n" +
            "\n" +
            "Being a 0 year old, Luna speaks in a childlike manner that almost resembles a toddler who just learned how to speak. She also often adds verbal tics like Nnnaaaaa~ (んなあああああ~) and Nanora (なのら) in her words. She also refers to herself in third person.",
    "Miko is a self-proclaimed \"elite\" gamer who is somewhat melodramatic and tends to become emotionally attached to NPCs and inanimate objects. Fans tend to use the term \"elite\" ironically to highlight Miko's questionable decision-making skills as well as her tendency to speak garbled nonsense punctuated by the occasional F-bomb. Though Miko specializes in role-playing games, much of the humor on her channel stems from the fact that even while playing graphic and violent games, such as Grand Theft Auto, she rarely takes her role seriously. Her love for erotic games often finds its way into other games that she plays, especially those featuring freely adjustable camera angles and skirt-wearing female characters.",
    "Botan's cool, mature appearance belies a cheerful and easygoing nature. She appears as very laid back during streams, even through intense gameplay and abrupt chaos. Botan cares deeply for her fellow Generation 5 hololive members, and sometimes acts as a leader for the group. She also has a bit of a mischievous streak—examples include dragging her friends into playing horror games and attempts to eat Tsunomaki Watame. Botan laughs often, even—maybe especially—when she encounters a challenge.",
    "Nene is a cheerful girl who loves to talk and sing. She dreams of becoming an idol and having her own anime opening song. She's very clumsy in games but shown impressive luck, displaying good aiming skills in Apex despite being a beginner or having 100% win rate in the first Among Us collaboration stream. She's overconfident about her gaming skills, calling herself Supernenechi. She is also complete beginner at Minecraft, falling a total of 16 times in her first hololive server Minecraft stream and failing Roboco's magma test. She was also seen as brute who indiscriminately attacked NPCs, animals and objects in the first 5th gen Craftopia stream in which Lamy scolded her for it.",
    "Rushia is a soft-spoken, somewhat naive girl who panics easily. While she is usually innocent and kind, she can occasionally become enraged and scream in an uncharacteristically beast-like manner before regaining her composure (for example, while playing Dark Souls or Mario Kart). She is infamous for her extremely poor anger management skills; in addition to screaming, she will often violently smash her fist against her desk. This behavior was previously regarded as breaking character, but it is now mostly considered part of her character.",
    "Watame speaks in a pleasant tone befitting her image of a soft fluffy sheep. Her voice has been noted by fans to be especially soft, mature and womanly. However, in direct contrast to this image, Watame often amuses herself by making crazed facial expressions. Her wide-eyed, psychotic smile has become iconic on her channel, even appearing on some of her official merchandise (a double-sided pillow cover). She also bobs and weaves her head and body around, which has become one of her signature gestures that she does especially when singing.",

    )
    private val HololiveIdolSubsCount = arrayOf(
        952000,
        1450000,
        1250000,
        1540000,
        592000,
        1050000,
        835000,
        651000,
        1210000,
        931000
    )
    val listData: ArrayList<Idol>
    get() {
        val list = arrayListOf<Idol>()
        for (position in HololiveIdolNames.indices) {
            val idols = Idol()
            idols.name = HololiveIdolNames[position]
            idols.photo = HololiveIdolsImage[position]
            idols.stream_channel = HoloLiveIdolsChannel[position]
            idols.personality = HololiveIdolsPersonality[position]
            idols.subsCount = HololiveIdolSubsCount[position]
            list.add(idols)
        }
        return list
    }
}