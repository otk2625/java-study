
  # 미니메이플스토리
 1. JAVA언어를 공부하면서 평소 좋아하던 게임을 만들자는 생각에 메이플스토리를 모티브삼아 프로젝트를 제작하게 되었습니다. 제작 기간은 3주정도 걸렸고 총 3명이 합작하여 만들었습니다

Git-Hub주소 - 
YouTube영상 -


만들고 싶었던 것
![그림1]()
![그림2]()

## 설치 및 실행
1. 설치
- SpringToolSuite4.exe툴을 사용하여 제작했으며, 위의 파일을 다운받아서 export하시면 되겠습니다.
- 이클립스도 실행이 될 것 같지만 SpringToolSuite4를 사용하시는걸 권장합니다.
2. 실행
- LoginScr클래스를 Run해서 실행 시키면 게임을 진행 할 수 있습니다.


## 중요클래스에 대한 설명

- [Player](#player)
- [MapleApp](#mapleapp)
- [LoginScr](#loginscr)
- [Enemy](#enemy)
- [GamePoint](#gamepoint)
- [Skill](#skill)
- [Enemy클래스를 상속받는 몬스터](#monster)

## Player
 - 사용자가 플레이하는 플레이어 JLabel클래스, 클래스 내부에는 플레이어가 움직일 수 있는 좌, 우, 점프 등의 메소드가 존재 스레드 사용이 많다보니 작은 렉이 발생한다.
``` JAVA
public void moveRight1() {
      if (isRight == false) {
         new Thread(new Runnable() {
            @Override
            public void run() {
               seewhere = true;
               isRight = true;
               while (isRight && hp > 0) {
                  moveRangeR();
                  // 오른쪽으로 보는중
                  setLocation(x, y); // 내부에 repaint() 존재
                  try {
                     Thread.sleep(3);
                     setIcon(icPlayerW);
                     Thread.sleep(3);
                     setIcon(icPlayerR);

                  } catch (InterruptedException e) {
                     e.printStackTrace();
                  }
               }
               setIcon(icPlayerW);

            }
         }).start();
      }
   }
```

## MapleApp
 - 게임이 실행되는 틀 JFrame 여기에서 게임이 진행된다. 공격했을때의 충돌을 검사하는 메소드나, 다른 모든 객체를 생성하는 역할

## LoginScr
 - 

## Enemy

## GamePoint

## Skill

## Enemy클래스를 상속받는 몬스터


```
```

## 만들어본 후기

## 부족한점

```
```

Note: The `license` badge image link at the top of this file should be updated with the correct `:user` and `:repo`.

### Any optional sections

## API

### Any optional sections

## More optional sections

## Contributing


