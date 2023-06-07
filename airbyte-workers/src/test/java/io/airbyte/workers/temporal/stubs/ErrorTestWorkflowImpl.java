/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.workers.temporal.stubs;

import io.airbyte.commons.temporal.exception.RetryableException;

@SuppressWarnings("MissingJavadocType")
public class ErrorTestWorkflowImpl implements TestWorkflow {

  @Override
  public void run() throws RetryableException {
    throw new RetryableException(new NullPointerException("test"));
  }

  @Override
  public void cancel() {}

  @Override
  public Integer getState() {
    return 1;
  }

}
