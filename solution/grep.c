#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[])
{
    char *search = argv[1];

    char *line = NULL;
    size_t len = 0;
    while (getline(&line, &len, stdin) != -1)
    {
        if (strstr(line, search) != NULL)
        {
            printf("%s", line);
        }
    }
    return 0;
}