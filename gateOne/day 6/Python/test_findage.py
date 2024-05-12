from task1 import findage

def test_findage():
	assert findage("03-02-1997") == 26
	assert findage("04-10-2000") == 23
	assert findage("11-12-2022") == 1
	assert findage("11-05-2022") == 1
	assert findage("11-12-2021") == 2