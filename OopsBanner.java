#include <iostream>
#include <vector>
using namespace std;

class CharacterPattern {
public:
    char character;
    string pattern[5];

    CharacterPattern(char c, string p[5]) {
        character = c;
        for(int i = 0; i < 5; i++) {
            pattern[i] = p[i];
        }
    }
};

int main() {

    string O[5] = {
        " *** ",
        "*   *",
        "*   *",
        "*   *",
        " *** "
    };

    string P[5] = {
        "**** ",
        "*   *",
        "**** ",
        "*    ",
        "*    "
    };

    string S[5] = {
        " ****",
        "*    ",
        " *** ",
        "    *",
        "**** "
    };

    vector<CharacterPattern> patterns;

    patterns.push_back(CharacterPattern('O', O));
    patterns.push_back(CharacterPattern('P', P));
    patterns.push_back(CharacterPattern('S', S));

    string word = "OOPS";

    for(int i = 0; i < 5; i++) {
        for(char c : word) {
            for(auto &cp : patterns) {
                if(cp.character == c) {
                    cout << cp.pattern[i] << "  ";
                }
            }
        }
        cout << endl;
    }

    return 0;
}
