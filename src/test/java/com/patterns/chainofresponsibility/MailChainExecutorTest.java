package com.patterns.chainofresponsibility;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;

public class MailChainExecutorTest {
    @Test
    public void createEmailValidationChain() {
        ValidateEmailCommand emailMock = mock(ValidateEmailCommand.class);
        MailChainExecutor executor = new MailChainExecutor(List.of(emailMock, mock(ValidateSenderCodeCommand.class), mock(ValidateReceiverCodeCommand.class)));
        Request request = new Request("", "", "");
        executor.execute(request);
        Mockito.verify(emailMock).execute(request);
    }
}
