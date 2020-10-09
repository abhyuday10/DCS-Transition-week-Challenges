#include <stdio.h>

// shakespeare should output: 124455  901325 shakespeare.txt
int main(int argc, char *argv[])
{
    int lines = 0;
    int words = 0;
    FILE *fp = fopen(argv[1], "r");

    int ch = 0;
    int chprev = 'z';
    while (!feof(fp))
    {
        ch = fgetc(fp);
        if (ch == '\n' || ch == '\0')
        {
            lines++;
        }
        if (ch != chprev && (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\0'))
        {
            words++;
        }
        chprev = ch;
    }
    printf("%d %d %s\n", lines, words, argv[1]);
    return 0;
}