#include <iostream>
#include <map>
using namespace std;

class BannerCharacterArray {
public:
    string pattern[5];

    BannerCharacterArray() {}

    BannerCharacterArray(string p[5]) {
        for(int i = 0; i < 5; i++) {
            pattern[i] = p[i];
        }
    }
};

int main() {

    map<char, BannerCharacterArray> bannerMap;

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

    bannerMap['O'] = BannerCharacterArray(O);
    bannerMap['P'] = BannerCharacterArray(P);
    bannerMap['S'] = BannerCharacterArray(S);

    string word = "OOPS";

    for(int row = 0; row < 5; row++) {
        for(char c : word) {
            cout << bannerMap[c].pattern[row] << "  ";
        }
        cout << endl;
    }

    return 0;
}
