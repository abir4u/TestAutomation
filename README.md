## To run all the Tests:

### mvn clean test -Dbrowser=chrome -Pproduction -Dcucumber.options="--tags @Automate"

# Some Info about the Test

### The User Stories

The two user stories are put in two different feature files with their corresponding scenarios:
1. Test User Story 1 - westpac-user-story-1.feature
2. Test User Story 2 - westpac-user-story-2.feature

### Breaking down the question

The question is as follows:

You are an Automation Tester on an agile project. You have following stories in backlog. Please write automation script(s) for following user stories.
- You may use any language, tool/framework to automate the user stories
- Your solution should reflect your level of expertise
- URL to be used for this exercise: http://www.westpac.co.nz/
- Navigation Flow KiwiSaver > KiwiSaver Calculators > Click here to get started button under (Westpac KiwiSaver Scheme Retirement Calculator)
- Please upload/share your solution to an online source control repository (e.g. GitHub, CodePlex)

**Note: The question specifies a particular navigation flow. Although there are different ways to navigate to the Westpac KiwiSaver Scheme Retirement Calculator (all of which are eligible for automation), the scenarios talk about the navigation mentioned in the question only.**

As specified in the above question, below is the technology stack used in this repository:
1. Webdriver - Selenium
2. Programming Language - Java
3. Framework - Selenium
4. Test Case Syntax - Gherkins
5. Browser - Chrome
6. Build tool - Maven
7. GitHub URL (Public) - https://github.com/abir4u/TestAutomation
8. Instruction for execution - Command provided on the first line of this README.md file

## Architecture of the Automation Framework Created:

The automation framework created in this repository is aimed to keep the implementation contemporary, interpretable and maintainable for the purpose of best practices.
Below are a few things that have been implemented, and a few things that could had been implemented, but was left out due to lack of time (the test had a time limit to maintain).

#### Things that have been implemented:

1. Page Object Model - This design pattern has been used along with Page Factory to make the code cleaner and easy to understand **for the developers**. It also separates the code from the test cases, thus making the code more reusable.
2. Behaviour Driven Development - This methodology has been used to make the test cases easy to understand **for the business stakeholders**.
3. Cucumber Reporting - This form of reporting has been used as it takes the least amount of time to implement, and yet provides with a presentable HTML report with adequate colour and focus to charts and tables, when it comes to representing the data.
4. **Reusable Wrapper Framework** - A reusable wrapper framework has been used to showcase the subtleness of my work and level of detail that I go to even in short tasks like this one.

#### Things that could had been implemented if I had more time:

1. CI/CD - Although I have created a prototype for this on my machine, I do not have a domain to host my Jenkins implementation and showcase it to you.
2. Parallel Execution - This could had been implemented with Cucumber 4 or TestNG, but I would prefer Cucumber 4 as it is easy to implement and faster.
3. Custom Reporting Tool - Tools like Perfecto, Dashing.io, Jenkins etc. provide lucrative reporting facilities, but I prefer developing my own (with React.js), as it can be made as per business requirement, making it crisp and easy to understand, yet effective.

Hope this was helpful to understand the repository. However, in case of any doubts feel free to reach out to me any time on my email abirpal16112@gmail.com or call me on 02102963036.

Please find the Author's SELFIE Below. ;)

```

                                                                 `````````````````````````````````
                                                                  `  `````````````````````````````
                                       ``````````                      ```````````````````````````
                                 `';<iixaAR%qPI=:.```````              ```````````````````````````
                           ```:L5XD8QQQQQQQQQQQQBNKZI>,````  ```      ````````````````````````````
                         `,=IKQBNQQQQQQ@@@@@@QQQQQQQQQQDY^^!;;:'``` ```  `````````````````````````
                       `,uP6%QQQQ@@@Q@@@@@@@@@@QQ@@@@@@@QQQQQQ%s:'`````   ````````````````````````
                       'EKbBQQQQ@@@@@@@@@@@@@@@@@@@@@@@@@@@QQQQWjT+``````````````````````  ```````
                      `7qNQQQ@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@QQQR7'```````````````````
                      `76BQQ@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@QQD}>.`````
                       ,jQQ@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@QQN{'``` `
                       .\QQ@@@@@@@@QQQ#8%%%W8N8WR%WNQQQ@@@@@@@@@@@@QQP_````````
                       ~AQQ@@@@QQQgDqUkEwwwkkUUUUAKKbDRg#QQQ@@@@@@@@QQi'`````````````
                       `uWQ@@@QRqUESojjjjjyoamhhkkkkkXX6KdR8QQQ@@@@@QQi,''...``````````
                       .zQQQQRkZ5yj{ItJtxxxIfjoo5aZSSSmEEkUqd%8BQ@@@QQL,'''''...`````````       `
                       ;NQQQ8XyunnIJzz777zzzJx{jjjyyoaammmEkX6bDgQ@@@QD;,,,''''...````````
                       TQQQQRkjYIsJJJzzzzzzz777zxIujyyoSmSmwEPEXqDQ@@@Q?~~:,,,'''..```````
                       LQQQNDPjIstttzzzzz77z7T7zzztsfjjyaaSmwEEPXD#Q@@W<;;;~_,,,'''.``````
                       ^QQQWKo}YxJz7\iii\cc777777z7zzIs{fjyoSEEhXKWQQQy+^^!;;~~:,,'..`````
                       ,NBNdajySaaoyjfxJJJz\ii\\7cznySEhEEwEkXXUX6d#QQ7>=++^!;;~~,,'.`````
                        yNRSZDB&QQQQQQQQ#DwYz7tJJtjwD8QQQQQQQQQQQRARQ&|*<<<=+^!;;~,''.```
                        =8k}6XPkXXUbR8N8RdUSyjaSyyaXDWNBQ&8gRgNN8NNUQb|??**<<=r!;~_,''.```
                        'D5s}n{ZEkkUKRgW%DbUmyj5SXdRg8NgDK666AqU6Aqk#XL|||??*<=^;;~,,'.```
                       .;6jztf6%KXQNQQD8WdUwj7isoUDD%R%K6R8QBN8gKXXwNwiLL|||?*<r!;~,,''.``
                       L7S}7JjwkwfDQQQKAqUEas\7uoXdDR%UyUQ@QgqNB%qXw%D6tiLL||?<+!;~,,''.``
                       ^?yJzs{}fyamSXUkwZZyt\L\Jfokbd6kXUAKddbbKK6XEdXqtiiLL||*+!;~,,''.``
                       ^LEzzJtsxtzJsuuIx}{J7\izYjyaE6kZaZSSSmEkXhhPEDAhs7ciLL|*+!;~,,''```
                       |xw7TiLii\7zz77zY{{J77zxujoEU6kajffjjjjjjyaSw%D6Yzz7\L|*+!;~,,'.```
                       *ya\L|??||LLi\z}yfnz\iL7IfoPUqqw{z77zzJxnjyZmNNDn777ciL*r!;~,,'.```
                       ~LJi||?*<?LLTsySz7z7i*=\Jf5wEmX%wn777zzsIfyawDKm7T\\iiL*+!;~,,'.```
                       `?fT\i|Li7zIjooyI{yaj{njow6KXXqNKyntJzIn}jowkKXu7T\iiiL*+!;~,,''.``
                        !ozzzzzujoao}suabNW8gDDNQ@@QBDqEooyyjjjyaPXdXjz77c\iiL*+!;~,,''.``
                        `jo{{yyaSmUKKUdRWQ@@@@Q@@@@@@QN8DbAXhEmSh6dgj7z77c\iiL*+!;~,,'.``
                        `7bkyjyaXNQQQQQQQ@QQQQQBQQ@@@@@@@QQWKPEPUD8g77z77c\iiL*r!;~,,'.```
                         :6dUw5aNQQ@QQN%%RDDDDDRgNW8#QQQ@@@QNXX6DNQX77z77c\iL|<^;;~,,'.```
                          <R%RDU&Q@QN%DbqUkmwEXXUqdDg&QQQQ@Q#dDgQQgx77z7Tc\iL|=^;~~,,'.```
                          `ENN#DQQQBRbAKDDdKKU6Kd%WN8gWg#QQQQQQQQQyz7zz77cii|*+!;~_,,'.```       `
                           .ZQQQQQQQNW%%Q@@@@QQQ@@@@Q8WWQQ@@QQQQQUxzzzz77ciL?>^;;~:,'.```        `
                            'jQQQQQQQQN#QQQQ@QQQ@@@@QQQQQ@@@@Q@@6uJzzzz77\i|*+!;~_,,'.````     ```
                             `zQQQ@QQQNW8QQQ@@@@@@@@QQQQQ@@@@@@DxJzzzzz7TiL?=^;;~,,'.``````   ````
                               |QQQ@@QQQ@QQQQ@QQQ@@@@@@@@@@@@@qsxJzzzzJ7ci|<^!;~:,,'.`````````````
                               `jQQ@@@@@@@@@@@Q@@@@@@@@@@@@@@AIsxtJzzzJ7i|*=^;~_,,''.`````````````
                                |qQ@@@@@@@@@@@@@@@@@@@@@@@@QRwIIsxtJzzJ7i|<r!;~:,,'.``````````````
                               `ijKQQ@@@@@@@@@@@@@@@@@@@@@QNKEj{IsxsJtIzcL*+!;~_,,'.``````````````
                          ````.^7zjKQQ@@@@@@@@@@@@@@@@@@@QNb6U%QbIYYxsut7i|>^;;~:,''.`````````````
                       _shS}zczz7zzxyDQ@@@@@@@@@@@@@@@@Q%dq6U6K&EJ}YIIfnJ7\|<+!;~_,,''''..........
                ``.,,,;D6auxJ777c7ciiJo%#Q@@@@@@@QQQQNDqUUXkUAdAus{}JzJzzJzcL?=^!;~:,,,,''''''''''
   ``.'',:~;;!+<>=<<^;{XnsJ77cii\Tc\iLi7syhqDKUKDKU6UUEEEEEhX6wxJJx77c\77i\\iL|*<+!;;~~~:,,,,,,,,,
~;!=?||L??||?|L|<||<^;5A}J7\\LL|Li\iiLLLiiTzxxsn{jjjjZZZSSmwkfz7c7zz7\i77\\i7\iL||*<=^^!;;;~~~~___
*|L||?*?|?*|i\7*=?i<!;LdwfYziL|||Li\iiiiLiLLLLi7zxI{jyaSwEEy7\\\\T7c77\i\ciiT77ciiiiLLLL?*=+^!!;;;
i\LL<+=|i?+|||i<^|*?!;^zkwyfYJc||?L\\iiiiiiiiii7JsnujowXXyz\\Lii\i\7\iii\77Tcci\\Li\iiiiiiLi|||?=r
77|i?^+iz|<*i|<!!*=?+;;^=nay}{{Iz7\iL|||i\\ccTzJJu}{jaZYTiT\ii\iLii\iii\7\\c\iiiiiLiiiic77\L|ii\L*
JL=*=;^i7L*?*<^;!*?^==!!^r>zf5junIzi|?*?Li\\iTzsnfjfsi||LLiLLLL||iLii|Li\iLL|ii|||LiLL|ic\i|?L\iL?
\><|+;<\7i?*++;;=i?<=+*^^;^^!^\fyyyfuz77zztsYIItz7L|LL||LL?*<LL|||LLL||Lii|||LL|?||?|?*|LL|?|Liii|
?+?>;!*iT||*+^~;*L|<==^^=+^;;!r+<*|Li7T7zTLi|<|L|L||||<<<==<<|i|??|****|LLLLL|L||?**=*LLiL??|LiLiL
<+<;~^|ii*=^!;;+Lii|<r++^^^^rr!!^^^^^=+=<+*<<=<*|||<*===?<+^+?L|?<<>?*<*|iii|LiLLL???==**?||<L\iLL
^^^~^*||?>=!;~!<|\i|?=+^+=+^!^^^^^^+=^+><<<*=>=*||?*>++<<=++*?|**<*<<=<|ii|<<*LLLLL|*=r=**L|LLLLLL
;;~;>||i==+;~~^=*L|?<++^<*=++^^+^!r=+++^+=<<>+=r+<??=+>=^+^^r<?<<<==^=**||*<<<><|ii|?<=^>*iL||?|?|
;~;=|||*+r^;~^<=*|||**^!=**=++=^^^^^^^^++^+++<=+<*|<+^=^^^^==***><<+++++<|?=^r+=<*|*<<+==*7L*<*|Li
~~^*|?>+=^^;;^==+|L*=*+!+*?*>+<+=+=<=>=^+=rr==++*?<+^++=^^^r==**<<=^+^r+<<*<+><>r<?L|?<^^>z|******

```
