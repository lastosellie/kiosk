### ■ 클라우드 네이티브 아키텍처(IaaS)
#### 1.클라우드 아키텍처 구성, MSA 아키텍처 구성도
![image](https://github.com/lastosellie/kitchen/assets/52234918/c447e763-3df1-4314-a293-35242534ae85)
<br />   

### ■ 클라우드 네이티브 모델링 (Biz.)
#### 1.도메인분석 - 이벤트 스토밍
![image](https://github.com/lastosellie/kiosk/assets/52234918/067d0f62-ccaf-4eed-852f-28bcd6e7fcf2)
<br />   

### ■ 클라우드 네이티브 개발 MSA (Dev.)
#### 1.분산트랜잭션 - Saga
```
http http://aca6b192910114b238e69fe51495f7a7-2098231161.ca-central-1.elb.amazonaws.com:8080/restaurantTables tableId=1 menuId=1 menuStatus=orderReady menuName=Orage menuPrice=1000
http http://aca6b192910114b238e69fe51495f7a7-2098231161.ca-central-1.elb.amazonaws.com:8080/restaurantTables tableId=1 menuId=2 menuStatus=orderReady menuName=Apple menuPrice=2000
```
![image](https://github.com/lastosellie/kiosk/assets/52234918/dd82b2c2-dc82-42ab-8842-0ad12ac4316a)
![image](https://github.com/lastosellie/kiosk/assets/52234918/66f2b4f8-8320-49bd-a18a-641be6eb93b2)
![image](https://github.com/lastosellie/kitchen/assets/52234918/2b82c5a2-5765-4fd1-aa0d-cfa6cd965963)
![image](https://github.com/lastosellie/kitchen/assets/52234918/98a23ab0-343c-4bea-8300-0fd5a18842e3)

#### 2.보상처리 - Compensation
![image](https://github.com/lastosellie/kiosk/assets/52234918/dd82b2c2-dc82-42ab-8842-0ad12ac4316a)
![image](https://github.com/lastosellie/kiosk/assets/52234918/66f2b4f8-8320-49bd-a18a-641be6eb93b2)

#### 3.단일 진입점 - Gateway
![image](https://github.com/lastosellie/kiosk/assets/52234918/5afcac08-38ff-45bf-afbb-0381c0198f3d)
![image](https://github.com/lastosellie/kiosk/assets/52234918/8cd90e7d-df91-456a-b240-3c01bdb160a8)
![image](https://github.com/lastosellie/kiosk/assets/52234918/6f96bfc3-7a6f-4a16-8962-f7decd7532dc)

#### 4.분산 데이터 프로젝션 - CQRS
![image](https://github.com/lastosellie/kiosk/assets/52234918/635aa552-3c1b-465b-a906-64150f48c204)
![image](https://github.com/lastosellie/kiosk/assets/52234918/031efded-7fbc-4cad-8b04-4fb08efae3c5)
```
http http://aca6b192910114b238e69fe51495f7a7-2098231161.ca-central-1.elb.amazonaws.com:8080/restaurantTables tableId=1 menuId=1 menuStatus=orderReady menuName=Orage menuPrice=1000
http http://aca6b192910114b238e69fe51495f7a7-2098231161.ca-central-1.elb.amazonaws.com:8080/restaurantTables tableId=1 menuId=2 menuStatus=orderReady menuName=Apple menuPrice=2000
```
![image](https://github.com/lastosellie/kiosk/assets/52234918/b2370007-553f-4fa5-8544-cb07980c412d)
* * *
### ■ 클라우드 네이티브 운영(PaaS)
#### 1.클라우드 배포 - Container 운영
![image](https://github.com/lastosellie/kiosk/assets/52234918/ae730840-528c-487f-b97a-3f2ec3c0d263)
![image](https://github.com/lastosellie/kiosk/assets/52234918/84667238-d23b-4de0-8109-91ad8f5e0b1f)
#### 2.컨테이너 자동확장 - HPA
![image](https://github.com/lastosellie/kitchen/assets/52234918/dd0b6f9b-3a83-42f2-a465-873f650a4a65)
#### 3.컨테이너로부터 환경분리 - ConfigMap/Secret
![image](https://github.com/lastosellie/kitchen/assets/52234918/f5c2e3b3-b590-47f3-aca5-dcdee8af2aca)
#### 4.클라우드스토리지 활용 - PVC
![image](https://github.com/lastosellie/kiosk/assets/52234918/ea45a299-e51a-420e-9475-9075420ca499)
![image](https://github.com/lastosellie/kiosk/assets/52234918/2c6e7c0d-676c-4b52-992a-37b016976a7c)
#### 5.셀프 힐링/무정지배포 - Liveness/Rediness Probe
readinessProbe
![image](https://github.com/lastosellie/kitchen/assets/52234918/4fdd8f2c-4796-4898-9f6e-4bea9d671e25)
![image](https://github.com/lastosellie/kitchen/assets/52234918/f8b119f2-06e6-4d9f-94ed-99ff8eb7f0ee)
#### 6.서비스 메시 응용 - Mesh (Istio)
![image](https://github.com/lastosellie/kitchen/assets/52234918/c2353970-ad84-49da-81b2-da45c81f2ffc)
![image](https://github.com/lastosellie/kitchen/assets/52234918/113b2459-4095-431c-a44d-be5545c79631)

#### 7.통합 모니터링 - Loggregation/Monitoring
![image](https://github.com/lastosellie/kitchen/assets/52234918/3db02798-9752-4eca-a231-1406bdf9555b)
![image](https://github.com/lastosellie/kitchen/assets/52234918/4c1beb44-610b-4f5a-89af-2d3a43f0eaca)
![image](https://github.com/lastosellie/kitchen/assets/52234918/caa6170c-18f5-4e24-940c-22f65eb9f2d0)


