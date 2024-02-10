/*

Description

Write a Java program that determines and prints all well-ordered three-digit numbers. A number is well-ordered if its digits increase from left to right. 
For example 123 is well ordered, 837 is not well ordered. 

Sample Output

123
124
125
126
127
128
129
134
135
136
137
138
139
145
146
147
148
149
156
157
158
159
167
168
169
178
179
189
234
235
236
237
238
239
245
246
247
248
249
256
257
258
259
267
268
269
278
279
289
345
346
347
348
349
356
357
358
359
367
368
369
378
379
389
456
457
458
459
467
468
469
478
479
489
567
568
569
578
579
589
678
679
689
789

*/

public class wellOrdered 
{
    public static void main(String[] args) 
    {
        int num1 = 0, num2 = 0, num3 = 0;

        for(int i = 100; i < 1000; i++)
        {
            int test = i;

            while(test > 0)
            {
                num1 = test % 10;
                test = test / 10;

                num2 = test % 10;
                test = test / 10;

                num3 = test % 10;

                if(num1 > num2 && num2 > num3)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
