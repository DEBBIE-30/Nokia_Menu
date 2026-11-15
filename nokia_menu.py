print("""
...................Nokia Main Menu...................

1.Phone book
2.Messages
3.Chat
4.Call register
5.Tones
6.Settings
7.Call divert
8.Music
9.Games
10.Calculator
11.Reminders
12.Clock
13.Profiles
14.Services
15.SIM services
.....................................................
""")
main_menu_option = int(input("Select one: "))
match main_menu_option:
    case 1 :
        print("""
                ..................Phone Book Menu...................
                1.Search
                2.Service Nos
                3.Add name
                4.Erase
                5.Edit
                6.Copy
                7.Assign tone
                8.Send b'card
                9.Options
                10.Speed dails
                11.Voicetags
                .................................................... """)
        phone_book_option = int(input("Select one: "))
        match (phone_book_option):
            case 1:
                print("Searching...")
            case 2:
                print("07040088885")
            case 3:
                print("Deborah Olusegun ")
            case 4:
                print("Erasing...")
            case 5:
                print("You have edited this contact successfully")
            case 6:
                print("Copy details ")
            case 7:
                print("Assigning tone")
            case 8:
                print("Send birthday card")
            case 9:
                print("""
                        ......................Options..................
                        1.Memory in use
                        2.Type of view
                        3.Memory status
                        ............................................... """)
                options = int(input("Select an option: "))
                match option:
                    case 1:
                        print("Nokia 33 Memory in use")
                    case 2:
                        print("Full View")
                    case 3:
                        print("5 GByte")
            case 10:
                print("Speed dailing")
            case 11:
                print("Voicetags")
    case 2 :
        print("""
                ........................Message Menu..............
        1.Write messages
        2.Inbox
        3.Outbox
        4.Picture Messages
        5.Templates
        6.Smileys
        7.Message Settings
        8.Info service
        9.Voice mailbox number
        10.Service command editor
        ...................................................
        """)
        message_menu_option = int(input("Select one: "))
        match (message_menu_option):
            case 1:
                print("Written Messages")
            case 2:
                print("Inbox")
            case 3:
                print("Outbox ")
            case 4:
                print("Picture Messages")
            case 5:
                print("Templates")
            case 6:
                print("Smileys")
            case 7:
                print("""
                ...................Message settings..................
                1. Set 1
                2. Common
                .....................................................
                """)
                message_settings = int(input("Select an option: "))
                match option:
                    case 1:
                        print("Set 1")
                    case 2:
                        print("Common")
            case 8:
                print("Info service")
            case 9:
                print("Voice mailbox number")
            case 10:
                print("Speed dailing")
            case 11:
                print("Service command editor")
