package chapter10.scheduler;

public class AgentGetCall implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담원이 다음 전화 요청");
;
    }

    @Override
    public void sendCalltoAgent() {
        System.out.println("상담원이 전화상담을 가져갔습니다.");
    }
}
