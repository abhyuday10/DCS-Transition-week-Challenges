#include <stdio.h>
int main(int argc, char *argv[])
{
    int lines;
    int words;
    FILE *fp = fopen(argv[1], "r");

    int ch;
    while (!feof(fp))
    {
        ch = fgetc(fp);
        if (ch == '\n')
        {
            lines++;
        }
        else if (ch == ' ')
        {
            words++;
        }
    }
    printf("%d %d %s\n", lines, words, argv[1]);
    return 0;
}