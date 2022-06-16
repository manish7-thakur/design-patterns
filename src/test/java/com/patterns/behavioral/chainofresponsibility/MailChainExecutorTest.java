package com.patterns.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;

public class MailChainExecutorTest {
    @Test
    public void createEmailValidationChain() {
        ValidateEmailCommand emailMock = mock(ValidateEmailCommand.class);
        ValidateSenderCodeCommand senderCodeMock = mock(ValidateSenderCodeCommand.class);
        ValidateReceiverCodeCommand receiverCodeMock = mock(ValidateReceiverCodeCommand.class);
        MailChainExecutor executor = new MailChainExecutor(List.of(emailMock, senderCodeMock, receiverCodeMock));
        Request request = new Request("", "", "");
        executor.execute(request);

        InOrder inOrder = Mockito.inOrder(emailMock, senderCodeMock, receiverCodeMock);
        inOrder.verify(emailMock).execute(request);
        inOrder.verify(senderCodeMock).execute(request);
        inOrder.verify(receiverCodeMock).execute(request);
    }
}
