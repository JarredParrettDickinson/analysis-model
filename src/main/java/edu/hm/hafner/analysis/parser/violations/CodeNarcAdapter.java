package edu.hm.hafner.analysis.parser.violations;

import se.bjurr.violations.lib.parsers.CodeNarcParser;

/**
 * Parses CodeNarc files.
 *
 * @author Ullrich Hafner
 */
public class CodeNarcAdapter extends AbstractViolationAdapter {
    private static final long serialVersionUID = -5699747899173867285L;

    @Override
    protected CodeNarcParser createParser() {
        return new CodeNarcParser();
    }
}
