#include <iostream>
#include <vector>
using namespace std;

int main()
{
    
    string line;
    vector<string> v;
    while(getline(cin, line)){
        if(line.empty()) break;
        v.push_back(line);
    }
    
    vector<string>::iterator i;
    int caseNumber = 1;
    
    for(i = v.begin() + 1; i != v.end(); i++){
        cout << "Case #" << caseNumber++ << ": ";
        for(string::size_type j = 0; j < (*i).size(); j++){
            if((*i)[j] == 'a'){
              if(j != 0 && ((*i)[j-1] == 'a' || (*i)[j-1] == 'b' || (*i)[j-1] == 'c')){
                  cout << " ";
              }
              cout << "2";
            }
            else if((*i)[j] == 'b'){
                if(j != 0 && ((*i)[j-1] == 'a' || (*i)[j-1] == 'b' || (*i)[j-1] == 'c')){
                  cout << " ";
                }
                cout << "22";
            }
            else if((*i)[j] == 'c'){
                if(j != 0 && ((*i)[j-1] == 'a' || (*i)[j-1] == 'b' || (*i)[j-1] == 'c')){
                  cout << " ";
                }
                cout << "222";
            }
            else if((*i)[j] == 'd'){
                if(j != 0 && ((*i)[j-1] == 'd' || (*i)[j-1] == 'e' || (*i)[j-1] == 'f')){
                  cout << " ";
                }
                cout << "3";
            }
            else if((*i)[j] == 'e'){
                if(j != 0 && ((*i)[j-1] == 'd' || (*i)[j-1] == 'e' || (*i)[j-1] == 'f')){
                  cout << " ";
                }
                cout << "33";
            }
            else if((*i)[j] == 'f'){
                if(j != 0 && ((*i)[j-1] == 'd' || (*i)[j-1] == 'e' || (*i)[j-1] == 'f')){
                  cout << " ";
                }
                cout << "333";
            }
            else if((*i)[j] == 'g'){
                if(j != 0 && ((*i)[j-1] == 'g' || (*i)[j-1] == 'h' || (*i)[j-1] == 'i')){
                  cout << " ";
                }
                cout << "4";
            }
            else if((*i)[j] == 'h'){
                if(j != 0 && ((*i)[j-1] == 'g' || (*i)[j-1] == 'h' || (*i)[j-1] == 'i')){
                  cout << " ";
                }
                cout << "44";
            }
            else if((*i)[j] == 'i'){
                if(j != 0 && ((*i)[j-1] == 'g' || (*i)[j-1] == 'h' || (*i)[j-1] == 'i')){
                  cout << " ";
                }
                cout << "444";
            }
            else if((*i)[j] == 'j'){
                if(j != 0 && ((*i)[j-1] == 'j' || (*i)[j-1] == 'k' || (*i)[j-1] == 'l')){
                  cout << " ";
                }
                cout << "5";
            }
            else if((*i)[j] == 'k'){
                if(j != 0 && ((*i)[j-1] == 'j' || (*i)[j-1] == 'k' || (*i)[j-1] == 'l')){
                  cout << " ";
                }
                cout << "55";
            }
            else if((*i)[j] == 'l'){
                if(j != 0 && ((*i)[j-1] == 'j' || (*i)[j-1] == 'k' || (*i)[j-1] == 'l')){
                  cout << " ";
                }
                cout << "555";
            }
            else if((*i)[j] == 'm'){
                if(j != 0 && ((*i)[j-1] == 'm' || (*i)[j-1] == 'n' || (*i)[j-1] == 'o')){
                  cout << " ";
                }
                cout << "6";
            }
            else if((*i)[j] == 'n'){
                if(j != 0 && ((*i)[j-1] == 'm' || (*i)[j-1] == 'n' || (*i)[j-1] == 'o')){
                  cout << " ";
                }
                cout << "66";
            }
            else if((*i)[j] == 'o'){
                if(j != 0 && ((*i)[j-1] == 'm' || (*i)[j-1] == 'n' || (*i)[j-1] == 'o')){
                  cout << " ";
                }
                cout << "666";
            }
            else if((*i)[j] == 'p'){
                if(j != 0 && ((*i)[j-1] == 'p' || (*i)[j-1] == 'q' || (*i)[j-1] == 'r' || (*i)[j-1] == 's')){
                  cout << " ";
                }
                cout << "7";
            }
            else if((*i)[j] == 'q'){
                if(j != 0 && ((*i)[j-1] == 'p' || (*i)[j-1] == 'q' || (*i)[j-1] == 'r' || (*i)[j-1] == 's')){
                  cout << " ";
                }
                cout << "77";
            }
            else if((*i)[j] == 'r'){
                if(j != 0 && ((*i)[j-1] == 'p' || (*i)[j-1] == 'q' || (*i)[j-1] == 'r' || (*i)[j-1] == 's')){
                  cout << " ";
                }
                cout << "777";
            }
            else if((*i)[j] == 's'){
                if(j != 0 && ((*i)[j-1] == 'p' || (*i)[j-1] == 'q' || (*i)[j-1] == 'r' || (*i)[j-1] == 's')){
                  cout << " ";
                }
                cout << "7777";
            }
            else if((*i)[j] == 't'){
                if(j != 0 && ((*i)[j-1] == 't' || (*i)[j-1] == 'u' || (*i)[j-1] == 'v')){
                  cout << " ";
                }
                cout << "8";
            }
            else if((*i)[j] == 'u'){
                if(j != 0 && ((*i)[j-1] == 't' || (*i)[j-1] == 'u' || (*i)[j-1] == 'v')){
                  cout << " ";
                }
                cout << "88";
            }
            else if((*i)[j] == 'v'){
                if(j != 0 && ((*i)[j-1] == 't' || (*i)[j-1] == 'u' || (*i)[j-1] == 'v')){
                  cout << " ";
                }
                cout << "888";
            }
            else if((*i)[j] == 'w'){
                if(j != 0 && ((*i)[j-1] == 'w' || (*i)[j-1] == 'x' || (*i)[j-1] == 'y' || (*i)[j-1] == 'z')){
                  cout << " ";
                }
                cout << "9";
            }
            else if((*i)[j] == 'x'){
                if(j != 0 && ((*i)[j-1] == 'w' || (*i)[j-1] == 'x' || (*i)[j-1] == 'y' || (*i)[j-1] == 'z')){
                  cout << " ";
                }
                cout << "99";
            }
            else if((*i)[j] == 'y'){
                if(j != 0 && ((*i)[j-1] == 'w' || (*i)[j-1] == 'x' || (*i)[j-1] == 'y' || (*i)[j-1] == 'z')){
                  cout << " ";
                }
                cout << "999";
            }
            else if((*i)[j] == 'z'){
                if(j != 0 && ((*i)[j-1] == 'w' || (*i)[j-1] == 'x' || (*i)[j-1] == 'y' || (*i)[j-1] == 'z')){
                  cout << " ";
                }
                cout << "9999";
            }
            else if((*i)[j] == ' '){
                if(j != 0 && (*i)[j-1] == ' '){
                  cout << " ";
                }
                cout << "0";
            }
        }
        cout << "\n";
    }
}